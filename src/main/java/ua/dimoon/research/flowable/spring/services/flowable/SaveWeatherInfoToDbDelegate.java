package ua.dimoon.research.flowable.spring.services.flowable;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.dimoon.research.flowable.spring.model.WeatherInfo;
import ua.dimoon.research.flowable.spring.model.dto.WeatherResponseDto;
import ua.dimoon.research.flowable.spring.repositories.WeatherInfoRepository;

@Service
public class SaveWeatherInfoToDbDelegate implements JavaDelegate {

    private WeatherInfoRepository weatherInfoRepository;

    @Autowired
    public SaveWeatherInfoToDbDelegate setWeatherInfoRepository(WeatherInfoRepository weatherInfoRepository) {
        this.weatherInfoRepository = weatherInfoRepository;
        return this;
    }

    @Override
    public void execute(DelegateExecution execution) {
        WeatherResponseDto weatherResponseDto = execution.getVariable(GetWeatherInfoDelegate.WEATHER_VAR_NAME, WeatherResponseDto.class);
        if (weatherResponseDto.getCod().equals("200")
                && weatherResponseDto.getCount() > 0) {
            weatherResponseDto.getList().stream().findFirst().map(weatherDto -> new WeatherInfo()
                    .setCity(weatherDto.getCityName())
                    .setHumidity(weatherDto.getMain().getHumidity())
                    .setPressure(weatherDto.getMain().getPressure())
                    .setTemp(weatherDto.getMain().getTemp()))
                    .ifPresent(weatherInfoRepository::save);
        }
    }
}

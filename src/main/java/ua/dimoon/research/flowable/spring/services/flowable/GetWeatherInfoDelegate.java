package ua.dimoon.research.flowable.spring.services.flowable;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.dimoon.research.flowable.spring.model.dto.WeatherResponseDto;
import ua.dimoon.research.flowable.spring.services.WeatherService;

import java.util.Optional;

@Service
public class GetWeatherInfoDelegate implements JavaDelegate {

    public static final String WEATHER_VAR_NAME = "weatherResponseDto";
    private WeatherService weatherService;

    @Autowired
    public void setWeatherService(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @Override
    public void execute(DelegateExecution execution) {
        Optional<WeatherResponseDto> weatherInfoOptional = weatherService.getWeather();
        weatherInfoOptional.ifPresent(System.out::println);
        weatherInfoOptional.ifPresent(weatherResponseDto -> execution.setVariable(WEATHER_VAR_NAME, weatherResponseDto));
    }
}

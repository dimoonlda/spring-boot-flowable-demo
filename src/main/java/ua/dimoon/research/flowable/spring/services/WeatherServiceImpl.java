package ua.dimoon.research.flowable.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ua.dimoon.research.flowable.spring.model.dto.WeatherResponseDto;

import java.util.Optional;

@Service
public class WeatherServiceImpl implements WeatherService {

    private static final String WEATHER_URL = "http://samples.openweathermap.org/data/2.5/find?q=London&units=metric&appid=b1b15e88fa797225412429c1c50c122a1";
    private RestTemplate restTemplate;

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Optional<WeatherResponseDto> getWeather() {
        WeatherResponseDto weatherResponseDto =
                restTemplate.getForObject(WEATHER_URL, WeatherResponseDto.class);
        try {
            Thread.sleep(10000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Optional.ofNullable(weatherResponseDto);
    }
}

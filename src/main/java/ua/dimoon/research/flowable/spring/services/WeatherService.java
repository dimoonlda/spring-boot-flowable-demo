package ua.dimoon.research.flowable.spring.services;

import ua.dimoon.research.flowable.spring.model.dto.WeatherResponseDto;

import java.util.Optional;

/**
 * Created by dimoon on 3/29/2017.
 */
public interface WeatherService {
    Optional<WeatherResponseDto> getWeather();

}

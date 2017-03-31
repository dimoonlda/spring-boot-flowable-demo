package ua.dimoon.research.flowable.spring.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ua.dimoon.research.flowable.spring.model.WeatherInfo;
import ua.dimoon.research.flowable.spring.model.dto.WeatherResponseDto;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WeatherServiceImplTest {
    private static final String CITY_NAME = "London";

    @Autowired
    private WeatherService weatherService;

    @Test
    public void testGetWeather() {
        Optional<WeatherResponseDto> weatherResponseDto = weatherService.getWeather();
        assertThat(weatherResponseDto.isPresent()).isTrue();
        WeatherResponseDto result = weatherResponseDto.get();
        weatherResponseDto.ifPresent(System.out::println);
        assertThat(result.getList().get(0).getCityName()).isEqualTo(CITY_NAME);
    }
}

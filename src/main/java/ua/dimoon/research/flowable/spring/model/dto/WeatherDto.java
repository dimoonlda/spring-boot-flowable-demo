package ua.dimoon.research.flowable.spring.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by dimoon on 3/29/2017.
 */
public class WeatherDto  implements Serializable {
    @JsonProperty(value = "name")
    private String cityName;
    private WeatherMainDto main;

    public WeatherMainDto getMain() {
        return main;
    }

    public WeatherDto setMain(WeatherMainDto main) {
        this.main = main;
        return this;
    }

    public String getCityName() {
        return cityName;
    }

    public WeatherDto setCityName(String cityName) {
        this.cityName = cityName;
        return this;
    }

    @Override
    public String toString() {
        return "WeatherDto{" +
                "cityName='" + cityName + '\'' +
                ", main=" + main +
                '}';
    }
}

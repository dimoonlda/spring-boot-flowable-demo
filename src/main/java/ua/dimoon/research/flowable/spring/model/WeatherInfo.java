package ua.dimoon.research.flowable.spring.model;

import javax.persistence.*;

@Table(name = "weather", schema = "schema1")
@Entity
public class WeatherInfo {
    @Id
    @GeneratedValue(generator = "weather_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(schema = "schema1", name = "weather_gen", allocationSize = 1, sequenceName = "weather_id_seq")
    private Long id;
    private String city;
    private Double temp;
    private Integer pressure;
    private Integer humidity;

    public Long getId() {
        return id;
    }

    public WeatherInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getCity() {
        return city;
    }

    public WeatherInfo setCity(String city) {
        this.city = city;
        return this;
    }

    public Double getTemp() {
        return temp;
    }

    public WeatherInfo setTemp(Double temp) {
        this.temp = temp;
        return this;
    }

    public Integer getPressure() {
        return pressure;
    }

    public WeatherInfo setPressure(Integer pressure) {
        this.pressure = pressure;
        return this;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public WeatherInfo setHumidity(Integer humidity) {
        this.humidity = humidity;
        return this;
    }

    @Override
    public String toString() {
        return "WeatherInfo{" +
                "city='" + city + '\'' +
                ", temp=" + temp +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                '}';
    }
}

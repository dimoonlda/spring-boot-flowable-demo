package ua.dimoon.research.flowable.spring.model.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dimoon on 3/29/2017.
 */
public class WeatherResponseDto implements Serializable{
    private String cod;
    private Integer count;
    private List<WeatherDto> list;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<WeatherDto> getList() {
        return list;
    }

    public void setList(List<WeatherDto> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "WeatherResponseDto{" +
                "cod='" + cod + '\'' +
                ", count=" + count +
                ", list=" + list +
                '}';
    }
}

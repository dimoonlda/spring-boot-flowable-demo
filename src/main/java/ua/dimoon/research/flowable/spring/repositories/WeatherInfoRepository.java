package ua.dimoon.research.flowable.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.dimoon.research.flowable.spring.model.WeatherInfo;

@Repository
public interface WeatherInfoRepository extends JpaRepository<WeatherInfo, Long> {
}

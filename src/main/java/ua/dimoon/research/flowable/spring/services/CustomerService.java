package ua.dimoon.research.flowable.spring.services;

import ua.dimoon.research.flowable.spring.model.dto.CustomerResponseDto;

import java.util.Optional;

/**
 * Created by dimoon on 3/30/2017.
 */
public interface CustomerService {
    Optional<CustomerResponseDto> getCustomer();
}

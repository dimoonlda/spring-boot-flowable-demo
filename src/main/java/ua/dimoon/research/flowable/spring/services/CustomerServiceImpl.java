package ua.dimoon.research.flowable.spring.services;

import org.springframework.stereotype.Service;
import ua.dimoon.research.flowable.spring.model.dto.CustomerResponseDto;

import java.util.Optional;
import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public Optional<CustomerResponseDto> getCustomer() {
        String identityCode = UUID.randomUUID().toString();
        try {
            Thread.sleep(10000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Optional.of(new CustomerResponseDto().setBossName("Test Boss").setTittle("Test Tittle").setIdentityCode(identityCode));
    }
}

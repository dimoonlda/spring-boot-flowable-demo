package ua.dimoon.research.flowable.spring.services.flowable;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.dimoon.research.flowable.spring.model.dto.CustomerResponseDto;
import ua.dimoon.research.flowable.spring.services.CustomerService;

import java.util.Optional;

@Service
public class GetCustomerInfoDelegate implements JavaDelegate {
    public static final String CUSTOMER_VAR_NAME = "customerResponseDto";

    private CustomerService customerService;

    @Autowired
    public GetCustomerInfoDelegate setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
        return this;
    }

    @Override
    public void execute(DelegateExecution execution) {
        Optional<CustomerResponseDto> customerInfoOptional = customerService.getCustomer();
        customerInfoOptional.ifPresent(System.out::println);
        customerInfoOptional.ifPresent(customerResponseDto -> execution.setVariable(CUSTOMER_VAR_NAME, customerResponseDto));
    }
}

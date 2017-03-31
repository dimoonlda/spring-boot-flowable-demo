package ua.dimoon.research.flowable.spring.services.flowable;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.dimoon.research.flowable.spring.model.Customer;
import ua.dimoon.research.flowable.spring.model.dto.CustomerResponseDto;
import ua.dimoon.research.flowable.spring.repositories.CustomerRepository;

@Service
public class SaveCustomerInfoToDbDelegate implements JavaDelegate {

    private CustomerRepository customerRepository;

    @Autowired
    public SaveCustomerInfoToDbDelegate setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
        return this;
    }

    @Override
    public void execute(DelegateExecution execution) {
        CustomerResponseDto customerResponseDto = execution.getVariable(GetCustomerInfoDelegate.CUSTOMER_VAR_NAME, CustomerResponseDto.class);
        customerRepository.save(new Customer()
                .setBossName(customerResponseDto.getBossName())
                .setIdentityCode(customerResponseDto.getIdentityCode())
                .setTittle(customerResponseDto.getTittle()));
    }
}

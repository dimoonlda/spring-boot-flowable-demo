package ua.dimoon.research.flowable.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.dimoon.research.flowable.spring.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

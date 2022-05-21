package guru.springframework.orderservice.repositories;

import guru.springframework.orderservice.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jt on 5/21/22.
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

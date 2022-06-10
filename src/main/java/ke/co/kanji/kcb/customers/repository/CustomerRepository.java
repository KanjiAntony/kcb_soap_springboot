package ke.co.kanji.kcb.customers.repository;

import ke.co.kanji.kcb.customers.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

    Customer findByCustomerEmail(String email);

}

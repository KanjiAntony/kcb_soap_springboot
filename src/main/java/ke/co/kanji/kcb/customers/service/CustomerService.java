package ke.co.kanji.kcb.customers.service;

import ke.co.kanji.kcb.customers.CreationStatus;
import ke.co.kanji.kcb.customers.entity.Customer;
import ke.co.kanji.kcb.customers.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository repository){
        customerRepository = repository;
    }

    public CreationStatus createCustomer(Customer customer) {
        customerRepository.save(customer);
        CreationStatus creationStatus = new CreationStatus();
        creationStatus.setCreationMessage("Customer created successfully");
        return creationStatus;
    }

    public Customer getCustomerFromEmail(String email)
    {
        return customerRepository.findByCustomerEmail(email);
    }

}

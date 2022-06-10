package ke.co.kanji.kcb.customers.service;

import ke.co.kanji.kcb.customers.CreationStatus;
import ke.co.kanji.kcb.customers.entity.CustomerAccount;
import ke.co.kanji.kcb.customers.repository.CustomerAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerAccountService {

    CustomerAccountRepository customerAccountRepository;

    @Autowired
    public CustomerAccountService(CustomerAccountRepository repository){
        customerAccountRepository = repository;
    }

    public CreationStatus createCustomerAccount(CustomerAccount customerAccount){
        customerAccountRepository.save(customerAccount);
        CreationStatus creationStatus = new CreationStatus();
        creationStatus.setCreationMessage("Customer account created successfully");
        return creationStatus;
    }

}

package ke.co.kanji.kcb.customers.api;

import ke.co.kanji.kcb.customers.Ken21083KcbCustomerAccountCreateRequest;
import ke.co.kanji.kcb.customers.Ken21083KcbCustomerAccountCreateResponse;
import ke.co.kanji.kcb.customers.Ken21083KcbCustomerCreateRequest;
import ke.co.kanji.kcb.customers.Ken21083KcbCustomerCreateResponse;
import ke.co.kanji.kcb.customers.entity.Customer;
import ke.co.kanji.kcb.customers.entity.CustomerAccount;
import ke.co.kanji.kcb.customers.service.CustomerAccountService;
import ke.co.kanji.kcb.customers.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CustomerEndpoint {

    @Autowired
    CustomerService customerService;

    @Autowired
    CustomerAccountService customerAccountService;

    public static final String NAMESPACE_URI = "http://kanji.co.ke/kcb/customers";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ken21083KcbCustomerCreateRequest")
    @ResponsePayload
    public Ken21083KcbCustomerCreateResponse customerCreate(@RequestPayload Ken21083KcbCustomerCreateRequest customerCreateRequest)
    {
        Ken21083KcbCustomerCreateResponse customerCreateResponse = new Ken21083KcbCustomerCreateResponse();

        Customer customer = new Customer();
        customer.setCustomerName(customerCreateRequest.getCustomerName());
        customer.setCustomerPhone(customerCreateRequest.getCustomerPhone());
        customer.setCustomerEmail(customerCreateRequest.getCustomerEmail());
        customer.setCustomerGender(customerCreateRequest.getCustomerGender());

        customerCreateResponse.setKen21083KcbCreationStatus(customerService.createCustomer(customer));

        return customerCreateResponse;

    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ken21083KcbCustomerAccountCreateRequest")
    @ResponsePayload
    public Ken21083KcbCustomerAccountCreateResponse customerAccountCreate(@RequestPayload Ken21083KcbCustomerAccountCreateRequest customerAccountCreateRequest)
    {

        Ken21083KcbCustomerAccountCreateResponse response = new Ken21083KcbCustomerAccountCreateResponse();

        Customer fetched_customer = customerService.getCustomerFromEmail(customerAccountCreateRequest.getCustomerEmail());

        CustomerAccount customerAccount = new CustomerAccount();
        customerAccount.setAccountType(customerAccountCreateRequest.getAccountType());
        customerAccount.setAccountNumber(customerAccountCreateRequest.getAccountNumber());
        customerAccount.setCustomer(fetched_customer);

        response.setKen21083KcbCreationStatus(customerAccountService.createCustomerAccount(customerAccount));

        return response;

    }

}

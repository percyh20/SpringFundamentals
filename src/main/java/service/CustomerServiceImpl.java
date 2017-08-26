package service;

import interfaces.CustomerRepository;
import model.Customer;
import java.util.List;

public class CustomerServiceImpl implements interfaces.CustomerService {
    private CustomerRepository customerRepository ;

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }


}

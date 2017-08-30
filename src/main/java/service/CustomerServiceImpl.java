package service;

import interfaces.CustomerRepository;
import model.Customer;
import java.util.List;

public class CustomerServiceImpl implements interfaces.CustomerService {
    private CustomerRepository customerRepository ;

    public CustomerServiceImpl(){

    }

    public CustomerServiceImpl (CustomerRepository customerRepo){
        this.customerRepository = customerRepo;
    }

    @Override
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

    public void setCustomerRepo(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

}

package repository;

import interfaces.CustomerRepository;
import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll(){
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFirstName("Percy");
        customer.setLastName("Herrera");

        customers.add(customer);
        return customers;
    }

}

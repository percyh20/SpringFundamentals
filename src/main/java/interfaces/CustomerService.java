package interfaces;

import model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}

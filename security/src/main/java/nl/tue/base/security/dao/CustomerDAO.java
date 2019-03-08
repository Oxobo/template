package nl.tue.base.security.dao;

import nl.tue.base.security.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerDAO extends CrudRepository<Customer, Long> {

}

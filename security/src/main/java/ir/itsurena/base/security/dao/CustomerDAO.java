package ir.itsurena.base.security.dao;

import ir.itsurena.base.security.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerDAO extends CrudRepository<Customer, Long> {

}

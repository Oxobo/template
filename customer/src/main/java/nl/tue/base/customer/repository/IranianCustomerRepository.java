package nl.tue.base.customer.repository;

import nl.tue.base.customer.domain.IranianCustomer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IranianCustomerRepository extends CrudRepository<IranianCustomer,Long> {
    IranianCustomer save(IranianCustomer iranianCustomer);
    List<IranianCustomer> findAll();
    IranianCustomer findByNationalId(String nationalId);
    IranianCustomer findById(long id);

}

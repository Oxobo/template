package ir.itsurena.base.customer.repository;


import ir.itsurena.base.customer.domain.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address,Long> {
    Address findByProvinceAndAndCity(String province, String city);
    Address save(Address address);
    Address findById(long id);

}

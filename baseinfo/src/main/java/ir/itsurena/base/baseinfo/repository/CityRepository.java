package ir.itsurena.base.baseinfo.repository;


import ir.itsurena.base.baseinfo.domain.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends CrudRepository<City,Long> {
    City findByCode(String code);
    List<City> findAllByName(String name);
}

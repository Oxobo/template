package nl.tue.base.baseinfo.repository;


import nl.tue.base.baseinfo.domain.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends CrudRepository<City,Long> {
    City findByCode(String code);
    List<City> findAllByName(String name);
}

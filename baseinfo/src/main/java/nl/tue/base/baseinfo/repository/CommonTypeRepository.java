package nl.tue.base.baseinfo.repository;


import nl.tue.base.baseinfo.domain.CommonType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommonTypeRepository extends CrudRepository<CommonType,Long> {
    CommonType findByKey(String key);
    List<CommonType> findAllByTitle(String title);
}

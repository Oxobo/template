package ir.itsurena.base.baseinfo.repository;


import ir.itsurena.base.baseinfo.domain.CommonType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommonTypeRepository extends CrudRepository<CommonType,Long> {
    CommonType findByKey(String key);
    List<CommonType> findAllByTitle(String title);
}

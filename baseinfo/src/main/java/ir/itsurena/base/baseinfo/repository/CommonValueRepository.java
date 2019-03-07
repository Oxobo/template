package ir.itsurena.base.baseinfo.repository;

import ir.itsurena.base.baseinfo.domain.CommonType;
import ir.itsurena.base.baseinfo.domain.CommonValue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommonValueRepository extends CrudRepository<CommonValue,Long> {
    CommonValue findByKey(String key);
    List<CommonValue> findAllByTitle(String title);
    List<CommonValue> findAllByCommonType(CommonType commonType);
}

package nl.tue.base.baseinfo.repository;

import nl.tue.base.baseinfo.domain.CommonType;
import nl.tue.base.baseinfo.domain.CommonValue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommonValueRepository extends CrudRepository<CommonValue,Long> {
    CommonValue findByKey(String key);
    List<CommonValue> findAllByTitle(String title);
    List<CommonValue> findAllByCommonType(CommonType commonType);
}

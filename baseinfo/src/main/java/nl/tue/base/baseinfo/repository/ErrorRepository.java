package nl.tue.base.baseinfo.repository;


import nl.tue.base.baseinfo.domain.Error;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ErrorRepository extends CrudRepository<Error,Long> {
    Error findByCode(String code);
    List<Error> findErrorByDescriptionLike(String word);
}

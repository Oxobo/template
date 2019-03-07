package ir.itsurena.base.baseinfo.repository;

import ir.itsurena.base.baseinfo.domain.State;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends CrudRepository<State,Long> {
    State findByCode(String code);
    State findByName(String name);
}

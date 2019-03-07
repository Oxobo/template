package ir.itsurena.base.sima.repository;

import ir.itsurena.base.sima.config.ServiceConfig;
import ir.itsurena.base.sima.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceConfigRepository extends BaseRepository<ServiceConfig, Integer> {

    ServiceConfig findByCode(Integer code);
}

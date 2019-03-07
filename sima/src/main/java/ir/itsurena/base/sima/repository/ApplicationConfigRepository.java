package ir.itsurena.base.sima.repository;

import ir.itsurena.base.sima.config.ApplicationConfig;
import ir.itsurena.base.sima.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationConfigRepository extends BaseRepository<ApplicationConfig, Integer> {


    ApplicationConfig findByKey(String key);

    ApplicationConfig findByValue(String value);
}

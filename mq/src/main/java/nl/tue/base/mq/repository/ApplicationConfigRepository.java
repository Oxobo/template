package nl.tue.base.mq.repository;

import nl.tue.base.mq.config.ApplicationConfig;
import nl.tue.base.mq.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationConfigRepository extends BaseRepository<ApplicationConfig, Integer> {


    ApplicationConfig findByKey(String key);

    ApplicationConfig findByValue(String value);
}

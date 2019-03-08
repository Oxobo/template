package nl.tue.base.mq.repository;

import nl.tue.base.mq.config.ServiceConfig;
import nl.tue.base.mq.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceConfigRepository extends BaseRepository<ServiceConfig, Integer> {

    ServiceConfig findByCode(Integer code);
}

package nl.tue.base.mq.repository;

import nl.tue.base.mq.model.MqResponseLog;
import nl.tue.base.mq.repository.base.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MqResponseLogRepository extends BaseRepository<MqResponseLog, Long> {

    @Query("select r from MqResponseLog r where r.correlationId = :correlationId")
    MqResponseLog findByCorrelationId(@Param("correlationId") String correlationId);
}

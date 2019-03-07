package ir.itsurena.base.sima.repository;

import ir.itsurena.base.sima.model.SimaResponseLog;
import ir.itsurena.base.sima.repository.base.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SimaResponseLogRepository extends BaseRepository<SimaResponseLog, Long> {

    @Query("select r from SimaResponseLog r where r.correlationId = :correlationId")
    SimaResponseLog findByCorrelationId(@Param("correlationId") String correlationId);
}

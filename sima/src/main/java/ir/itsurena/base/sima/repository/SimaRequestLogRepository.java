package ir.itsurena.base.sima.repository;

import ir.itsurena.base.sima.model.SimaRequestLog;
import ir.itsurena.base.sima.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimaRequestLogRepository extends BaseRepository<SimaRequestLog, Long> {

    SimaRequestLog findByMessageId(String messageId);
}

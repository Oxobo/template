package nl.tue.base.mq.repository;

import nl.tue.base.mq.model.MqRequestLog;
import nl.tue.base.mq.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MqRequestLogRepository extends BaseRepository<MqRequestLog, Long> {

    MqRequestLog findByMessageId(String messageId);
}

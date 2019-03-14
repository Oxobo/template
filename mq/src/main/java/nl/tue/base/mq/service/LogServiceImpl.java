package nl.tue.base.mq.service;


import nl.tue.base.dto.library.AckCodeType;
import nl.tue.base.dto.request.AbstractRequestType;
import nl.tue.base.dto.response.AbstractResponseType;
import nl.tue.base.mq.model.MqRequestLog;
import nl.tue.base.mq.model.MqResponseLog;
import nl.tue.base.mq.repository.MqRequestLogRepository;
import nl.tue.base.mq.repository.MqResponseLogRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.TextMessage;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class LogServiceImpl implements LogService {

    private final Logger logger = LogManager.getLogger(LogServiceImpl.class);
    private final MqResponseLogRepository responseRepository;
    private final MqRequestLogRepository requestLogRepository;



    @Autowired
    public LogServiceImpl(MqResponseLogRepository responseRepository, MqRequestLogRepository requestLogRepository) {
        this.responseRepository = responseRepository;
        this.requestLogRepository = requestLogRepository;
    }

    //request
    @Override
    public void insertMqRequestLog(AbstractRequestType requestType, String xml) {

        MqRequestLog requestLog = new MqRequestLog();
        requestLog.setXmlData(xml);
        requestLog.setMessageId(requestType.getMessageId());
        requestLogRepository.save(requestLog);

    }

    @Override
    public MqRequestLog findMqRequestLog(String messageId) {
        return new MqRequestLog();
    }

    //response
    @Override
    public void insertMqResponseLog(AbstractResponseType responseType, TextMessage message) throws JMSException {

        MqResponseLog response = new MqResponseLog();
        List<String> responseErrors = new ArrayList();

        if (!responseType.getErrors().isEmpty() &&
                responseType.getAck() == AckCodeType.FAILURE) {

            responseType.getErrors().forEach(a -> responseErrors.add(a.getCode()));

            response.setErrorCodes(responseErrors);
        }

        response.setCreationTime(new Date());
        response.setCorrelationId(responseType.getCorrelationId());
        response.setXmlData(message.getText());
        response.setPublishDate(new Date(message.getJMSTimestamp()));

        try {
            responseRepository.save(response);
        } catch (Exception e) {
            logger.error(e.getMessage());

        }
    }

    @Override
    public MqResponseLog findMqResponseLog(String correlationId) {
        return responseRepository.findByCorrelationId(correlationId);
    }

}

package ir.itsurena.base.sima.service;


import ir.itsurena.base.sima.annotation.HandleException;
import ir.itsurena.base.dto.library.AckCodeType;
import ir.itsurena.base.dto.request.AbstractRequestType;
import ir.itsurena.base.dto.response.AbstractResponseType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ir.itsurena.base.sima.model.SimaRequestLog;
import ir.itsurena.base.sima.model.SimaResponseLog;
import ir.itsurena.base.sima.repository.SimaRequestLogRepository;
import ir.itsurena.base.sima.repository.SimaResponseLogRepository;
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
    private final SimaResponseLogRepository responseRepository;
    private final SimaRequestLogRepository requestLogRepository;



    @Autowired
    public LogServiceImpl(SimaResponseLogRepository responseRepository, SimaRequestLogRepository requestLogRepository) {
        this.responseRepository = responseRepository;
        this.requestLogRepository = requestLogRepository;
    }

    //request
    @Override
    public void insertSimaRequestLog(AbstractRequestType requestType, String xml) {

        SimaRequestLog requestLog = new SimaRequestLog();
        requestLog.setXmlData(xml);
        requestLog.setMessageId(requestType.getMessageId());
        requestLogRepository.save(requestLog);

    }

    @Override
    @HandleException
    public SimaRequestLog findSimaRequestLog(String messageId) {
        return new SimaRequestLog();
    }

    //response
    @Override
    public void insertSimaResponseLog(AbstractResponseType responseType, TextMessage message) throws JMSException {

        SimaResponseLog response = new SimaResponseLog();
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
    @HandleException
    public SimaResponseLog findSimaResponseLog(String correlationId) {
        return responseRepository.findByCorrelationId(correlationId);
    }

}

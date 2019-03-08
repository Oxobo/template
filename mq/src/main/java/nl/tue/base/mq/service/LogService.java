package nl.tue.base.mq.service;


import nl.tue.base.dto.request.AbstractRequestType;
import nl.tue.base.dto.response.AbstractResponseType;
import nl.tue.base.mq.model.MqRequestLog;
import nl.tue.base.mq.model.MqResponseLog;

import javax.jms.JMSException;
import javax.jms.TextMessage;

public interface LogService {


    //request logging
    void insertMqRequestLog(AbstractRequestType requestType, String xml);

    MqRequestLog findMqRequestLog(String messsageId);

    //response logging
    void insertMqResponseLog(AbstractResponseType responseType, TextMessage message) throws  JMSException;

    MqResponseLog findMqResponseLog(String correlationId);

}

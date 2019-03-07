package ir.itsurena.base.sima.service;


import ir.itsurena.base.dto.request.AbstractRequestType;
import ir.itsurena.base.dto.response.AbstractResponseType;
import ir.itsurena.base.sima.model.SimaRequestLog;
import ir.itsurena.base.sima.model.SimaResponseLog;

import javax.jms.JMSException;
import javax.jms.TextMessage;

public interface LogService {


    //request logging
    void insertSimaRequestLog(AbstractRequestType requestType, String xml);

    SimaRequestLog findSimaRequestLog(String messsageId);

    //response logging
    void insertSimaResponseLog(AbstractResponseType responseType, TextMessage message) throws  JMSException;

    SimaResponseLog findSimaResponseLog(String correlationId);

}

package nl.tue.base.mq.response;

import nl.tue.base.dto.response.ApproveResaleSecuritiesResponseType;

import javax.xml.bind.JAXBElement;

public interface ApproveResaleSecuritiesResponseService extends MqResponseBaseService {
    JAXBElement<ApproveResaleSecuritiesResponseType>
                createElement(ApproveResaleSecuritiesResponseType value);
}

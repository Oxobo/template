package nl.tue.base.mq.response;

import nl.tue.base.dto.response.RedemptionSecuritiesResponseType;

import javax.xml.bind.JAXBElement;

public interface RedemptionSecuritiesResponseService extends MqResponseBaseService {
    JAXBElement<RedemptionSecuritiesResponseType>
                createElement(RedemptionSecuritiesResponseType value);
}

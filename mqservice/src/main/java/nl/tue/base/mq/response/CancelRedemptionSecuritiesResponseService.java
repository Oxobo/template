package nl.tue.base.mq.response;

import nl.tue.base.dto.response.CancelRedemptionSecuritiesResponseType;

import javax.xml.bind.JAXBElement;

public interface CancelRedemptionSecuritiesResponseService extends MqResponseBaseService {
    JAXBElement<CancelRedemptionSecuritiesResponseType>
                createElement(CancelRedemptionSecuritiesResponseType value);
}

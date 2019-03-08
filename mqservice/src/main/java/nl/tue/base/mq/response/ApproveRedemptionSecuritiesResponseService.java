package nl.tue.base.mq.response;

import nl.tue.base.dto.response.ApproveRedemptionSecuritiesResponseType;

import javax.xml.bind.JAXBElement;

public interface ApproveRedemptionSecuritiesResponseService extends MqResponseBaseService {
    JAXBElement<ApproveRedemptionSecuritiesResponseType>
                createElement(ApproveRedemptionSecuritiesResponseType value);
}

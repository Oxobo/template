package nl.tue.base.mq.request;

import nl.tue.base.dto.request.RedemptionSecuritiesRequestType;

import javax.xml.bind.JAXBElement;

public interface RedemptionSecuritiesRequestService {
    RedemptionSecuritiesRequestType createType();
    JAXBElement<RedemptionSecuritiesRequestType> createElement(RedemptionSecuritiesRequestType value);
}

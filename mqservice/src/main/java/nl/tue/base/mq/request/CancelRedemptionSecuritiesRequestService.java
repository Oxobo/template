package nl.tue.base.mq.request;

import nl.tue.base.dto.request.CancelRedemptionSecuritiesRequestType;

import javax.xml.bind.JAXBElement;

public interface CancelRedemptionSecuritiesRequestService {
    CancelRedemptionSecuritiesRequestType createType();
    JAXBElement<CancelRedemptionSecuritiesRequestType> createElement(CancelRedemptionSecuritiesRequestType value);
}

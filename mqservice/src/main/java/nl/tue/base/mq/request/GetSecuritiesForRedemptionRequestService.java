package nl.tue.base.mq.request;

import nl.tue.base.dto.request.GetSecuritiesForRedemptionRequestType;

import javax.xml.bind.JAXBElement;

public interface GetSecuritiesForRedemptionRequestService {
    GetSecuritiesForRedemptionRequestType createType();
    JAXBElement<GetSecuritiesForRedemptionRequestType> createElement(GetSecuritiesForRedemptionRequestType value);
}

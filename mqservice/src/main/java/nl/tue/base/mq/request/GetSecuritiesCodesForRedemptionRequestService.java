package nl.tue.base.mq.request;

import nl.tue.base.dto.request.GetSecuritiesCodesForRedemptionRequestType;

import javax.xml.bind.JAXBElement;

public interface GetSecuritiesCodesForRedemptionRequestService {
    GetSecuritiesCodesForRedemptionRequestType createType();
    JAXBElement<GetSecuritiesCodesForRedemptionRequestType> createElement(GetSecuritiesCodesForRedemptionRequestType value);
}

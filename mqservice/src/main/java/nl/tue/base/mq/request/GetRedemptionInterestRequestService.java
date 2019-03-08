package nl.tue.base.mq.request;

import nl.tue.base.dto.request.GetRedemptionInterestRequestType;

import javax.xml.bind.JAXBElement;

public interface GetRedemptionInterestRequestService {
    GetRedemptionInterestRequestType createType();
    JAXBElement<GetRedemptionInterestRequestType> createElement(GetRedemptionInterestRequestType value);
}

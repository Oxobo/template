package nl.tue.base.mq.request;

import nl.tue.base.dto.request.GetResaleInterestRequestType;

import javax.xml.bind.JAXBElement;

public interface GetResaleInterestRequestService {
    GetResaleInterestRequestType createType();
    JAXBElement<GetResaleInterestRequestType> createElement(GetResaleInterestRequestType value);
}

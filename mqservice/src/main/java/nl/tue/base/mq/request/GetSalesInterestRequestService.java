package nl.tue.base.mq.request;

import nl.tue.base.dto.request.GetSalesInterestRequestType;

import javax.xml.bind.JAXBElement;

public interface GetSalesInterestRequestService {
    GetSalesInterestRequestType createType();
    JAXBElement<GetSalesInterestRequestType> createElement(GetSalesInterestRequestType value);
}

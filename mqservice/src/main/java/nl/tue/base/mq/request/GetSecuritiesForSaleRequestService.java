package nl.tue.base.mq.request;

import nl.tue.base.dto.request.GetSecuritiesForSaleRequestType;

import javax.xml.bind.JAXBElement;

public interface GetSecuritiesForSaleRequestService {
    GetSecuritiesForSaleRequestType createType();
    JAXBElement<GetSecuritiesForSaleRequestType> createElement(GetSecuritiesForSaleRequestType value);
}

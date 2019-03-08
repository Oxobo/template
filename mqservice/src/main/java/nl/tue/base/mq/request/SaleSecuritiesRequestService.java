package nl.tue.base.mq.request;

import nl.tue.base.dto.request.SaleSecuritiesRequestType;

import javax.xml.bind.JAXBElement;

public interface SaleSecuritiesRequestService {
    SaleSecuritiesRequestType createType();
    JAXBElement<SaleSecuritiesRequestType> createElement(SaleSecuritiesRequestType value);
}

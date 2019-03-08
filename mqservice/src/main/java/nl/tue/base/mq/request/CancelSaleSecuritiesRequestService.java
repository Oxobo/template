package nl.tue.base.mq.request;

import nl.tue.base.dto.request.CancelSaleSecuritiesRequestType;

import javax.xml.bind.JAXBElement;

public interface CancelSaleSecuritiesRequestService {
    CancelSaleSecuritiesRequestType createType();
    JAXBElement<CancelSaleSecuritiesRequestType> createElement(CancelSaleSecuritiesRequestType value);
}

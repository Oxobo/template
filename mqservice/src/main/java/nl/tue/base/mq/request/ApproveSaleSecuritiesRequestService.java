package nl.tue.base.mq.request;

import nl.tue.base.dto.request.ApproveSaleSecuritiesRequestType;

import javax.xml.bind.JAXBElement;

public interface ApproveSaleSecuritiesRequestService {

    ApproveSaleSecuritiesRequestType createType();
    JAXBElement<ApproveSaleSecuritiesRequestType> createElement(ApproveSaleSecuritiesRequestType value);
}

package nl.tue.base.mq.request;

import nl.tue.base.dto.request.CancelResaleSecuritiesRequestType;

import javax.xml.bind.JAXBElement;

public interface CancelResaleSecuritiesRequestService {
    CancelResaleSecuritiesRequestType createType();
    JAXBElement<CancelResaleSecuritiesRequestType> createElement(CancelResaleSecuritiesRequestType value);
}

package nl.tue.base.mq.request;

import nl.tue.base.dto.request.TransferSecuritiesRequestType;

import javax.xml.bind.JAXBElement;

public interface TransferSecuritiesRequestService {
    TransferSecuritiesRequestType createType();
    JAXBElement<TransferSecuritiesRequestType> createElement(TransferSecuritiesRequestType value);
}

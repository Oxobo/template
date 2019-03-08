package nl.tue.base.mq.request;

import nl.tue.base.dto.request.CancelTransferSecuritiesRequestType;

import javax.xml.bind.JAXBElement;

public interface CancelTransferSecuritiesRequestService {
    CancelTransferSecuritiesRequestType createType();
    JAXBElement<CancelTransferSecuritiesRequestType> createElement(CancelTransferSecuritiesRequestType value);
}

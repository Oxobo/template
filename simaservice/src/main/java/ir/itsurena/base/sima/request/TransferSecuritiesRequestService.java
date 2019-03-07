package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.TransferSecuritiesRequestType;

import javax.xml.bind.JAXBElement;

public interface TransferSecuritiesRequestService {
    TransferSecuritiesRequestType createType();
    JAXBElement<TransferSecuritiesRequestType> createElement(TransferSecuritiesRequestType value);
}

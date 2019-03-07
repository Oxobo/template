package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.UnblockAccountRequestType;

import javax.xml.bind.JAXBElement;

public interface UnblockAccountRequestService {
    UnblockAccountRequestType createType();
    JAXBElement<UnblockAccountRequestType> createElement(UnblockAccountRequestType value);
}

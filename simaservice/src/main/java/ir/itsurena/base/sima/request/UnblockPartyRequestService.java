package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.UnblockPartyRequestType;

import javax.xml.bind.JAXBElement;

public interface UnblockPartyRequestService {
    UnblockPartyRequestType createType();
    JAXBElement<UnblockPartyRequestType> createElement(UnblockPartyRequestType value);
}

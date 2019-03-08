package nl.tue.base.mq.request;

import nl.tue.base.dto.request.UnblockPartyRequestType;

import javax.xml.bind.JAXBElement;

public interface UnblockPartyRequestService {
    UnblockPartyRequestType createType();
    JAXBElement<UnblockPartyRequestType> createElement(UnblockPartyRequestType value);
}

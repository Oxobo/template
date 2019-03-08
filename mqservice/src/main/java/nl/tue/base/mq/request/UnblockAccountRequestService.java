package nl.tue.base.mq.request;

import nl.tue.base.dto.request.UnblockAccountRequestType;

import javax.xml.bind.JAXBElement;

public interface UnblockAccountRequestService {
    UnblockAccountRequestType createType();
    JAXBElement<UnblockAccountRequestType> createElement(UnblockAccountRequestType value);
}

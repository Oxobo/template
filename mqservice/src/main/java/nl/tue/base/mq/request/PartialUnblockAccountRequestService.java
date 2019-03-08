package nl.tue.base.mq.request;

import nl.tue.base.dto.request.PartialUnblockAccountRequestType;

import javax.xml.bind.JAXBElement;

public interface PartialUnblockAccountRequestService {
    PartialUnblockAccountRequestType createType();
    JAXBElement<PartialUnblockAccountRequestType> createElement(PartialUnblockAccountRequestType value);
}

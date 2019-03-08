package nl.tue.base.mq.request;

import nl.tue.base.dto.request.PartialBlockAccountRequestType;

import javax.xml.bind.JAXBElement;

public interface PartialBlockAccountRequestService {
    PartialBlockAccountRequestType createType();
    JAXBElement<PartialBlockAccountRequestType> createElement(PartialBlockAccountRequestType value);
}

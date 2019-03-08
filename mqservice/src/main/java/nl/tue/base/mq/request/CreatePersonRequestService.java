package nl.tue.base.mq.request;

import nl.tue.base.dto.request.CreatePersonRequestType;

import javax.xml.bind.JAXBElement;

public interface CreatePersonRequestService {
    CreatePersonRequestType createType();
    JAXBElement<CreatePersonRequestType> createElement(CreatePersonRequestType value);
}

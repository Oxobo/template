package nl.tue.base.mq.request;

import nl.tue.base.dto.request.UpdatePersonRequestType;

import javax.xml.bind.JAXBElement;

public interface UpdatePersonRequestService {
    UpdatePersonRequestType createType();
    JAXBElement<UpdatePersonRequestType> createElement(UpdatePersonRequestType value);
}

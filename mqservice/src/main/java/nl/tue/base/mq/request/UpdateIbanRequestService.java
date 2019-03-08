package nl.tue.base.mq.request;

import nl.tue.base.dto.request.UpdateIbanRequestType;

import javax.xml.bind.JAXBElement;

public interface UpdateIbanRequestService {
    UpdateIbanRequestType createType();
    JAXBElement<UpdateIbanRequestType> createElement(UpdateIbanRequestType value);
}

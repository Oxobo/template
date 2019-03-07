package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.UpdatePersonRequestType;

import javax.xml.bind.JAXBElement;

public interface UpdatePersonRequestService {
    UpdatePersonRequestType createType();
    JAXBElement<UpdatePersonRequestType> createElement(UpdatePersonRequestType value);
}

package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.CreateOrganizationRequestType;
import ir.itsurena.base.dto.request.CreatePersonRequestType;

import javax.xml.bind.JAXBElement;

public interface CreatePersonRequestService {
    CreatePersonRequestType createType();
    JAXBElement<CreatePersonRequestType> createElement(CreatePersonRequestType value);
}

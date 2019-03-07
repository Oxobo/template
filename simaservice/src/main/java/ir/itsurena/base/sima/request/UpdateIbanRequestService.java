package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.UpdateIbanRequestType;

import javax.xml.bind.JAXBElement;

public interface UpdateIbanRequestService {
    UpdateIbanRequestType createType();
    JAXBElement<UpdateIbanRequestType> createElement(UpdateIbanRequestType value);
}

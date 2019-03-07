package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.UpdateIbanRequestType;
import ir.itsurena.base.dto.request.UpdateOrganizationRequestType;

import javax.xml.bind.JAXBElement;

public interface UpdateOrganizationRequestService {
    UpdateOrganizationRequestType createType();
    JAXBElement<UpdateOrganizationRequestType> createElement(UpdateOrganizationRequestType value);
}

package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.CancelTransferSecuritiesRequestType;
import ir.itsurena.base.dto.request.CreateOrganizationRequestType;

import javax.xml.bind.JAXBElement;

public interface CreateOrganizationRequestService {
    CreateOrganizationRequestType createType();
    JAXBElement<CreateOrganizationRequestType> createElement(CreateOrganizationRequestType value);
}

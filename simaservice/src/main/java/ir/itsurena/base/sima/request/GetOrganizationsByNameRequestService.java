package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.GetOrganizationByIdentifierRequestType;
import ir.itsurena.base.dto.request.GetOrganizationsByNameRequestType;

import javax.xml.bind.JAXBElement;

public interface GetOrganizationsByNameRequestService {
    GetOrganizationsByNameRequestType createType();
    JAXBElement<GetOrganizationsByNameRequestType> createElement(GetOrganizationsByNameRequestType value);
}

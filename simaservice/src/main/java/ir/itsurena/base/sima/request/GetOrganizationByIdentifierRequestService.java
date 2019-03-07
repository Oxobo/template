package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.GetAllocatedSecuritiesRequestType;
import ir.itsurena.base.dto.request.GetOrganizationByIdentifierRequestType;

import javax.xml.bind.JAXBElement;

public interface GetOrganizationByIdentifierRequestService {
    GetOrganizationByIdentifierRequestType createType();
    JAXBElement<GetOrganizationByIdentifierRequestType> createElement(GetOrganizationByIdentifierRequestType value);
}

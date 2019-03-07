package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.GetOrganizationsByNameRequestType;
import ir.itsurena.base.dto.request.GetPersonByIdentifierRequestType;

import javax.xml.bind.JAXBElement;

public interface GetPersonByIdentifierRequestService {
    GetPersonByIdentifierRequestType createType();
    JAXBElement<GetPersonByIdentifierRequestType> createElement(GetPersonByIdentifierRequestType value);
}

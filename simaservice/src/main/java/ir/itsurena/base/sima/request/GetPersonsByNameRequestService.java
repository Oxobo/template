package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.GetPersonByIdentifierRequestType;
import ir.itsurena.base.dto.request.GetPersonsByNameRequestType;

import javax.xml.bind.JAXBElement;

public interface GetPersonsByNameRequestService {
    GetPersonsByNameRequestType createType();
    JAXBElement<GetPersonsByNameRequestType> createElement(GetPersonsByNameRequestType value);
}

package nl.tue.base.mq.request;

import nl.tue.base.dto.request.GetPersonByIdentifierRequestType;

import javax.xml.bind.JAXBElement;

public interface GetPersonByIdentifierRequestService {
    GetPersonByIdentifierRequestType createType();
    JAXBElement<GetPersonByIdentifierRequestType> createElement(GetPersonByIdentifierRequestType value);
}

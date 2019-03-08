package nl.tue.base.mq.request;

import nl.tue.base.dto.request.GetPersonsByNameRequestType;

import javax.xml.bind.JAXBElement;

public interface GetPersonsByNameRequestService {
    GetPersonsByNameRequestType createType();
    JAXBElement<GetPersonsByNameRequestType> createElement(GetPersonsByNameRequestType value);
}

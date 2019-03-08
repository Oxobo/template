package nl.tue.base.mq.request;

import nl.tue.base.dto.request.GetOrganizationByIdentifierRequestType;

import javax.xml.bind.JAXBElement;

public interface GetOrganizationByIdentifierRequestService {
    GetOrganizationByIdentifierRequestType createType();
    JAXBElement<GetOrganizationByIdentifierRequestType> createElement(GetOrganizationByIdentifierRequestType value);
}

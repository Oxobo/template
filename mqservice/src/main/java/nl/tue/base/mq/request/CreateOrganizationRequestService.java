package nl.tue.base.mq.request;

import nl.tue.base.dto.request.CreateOrganizationRequestType;

import javax.xml.bind.JAXBElement;

public interface CreateOrganizationRequestService {
    CreateOrganizationRequestType createType();
    JAXBElement<CreateOrganizationRequestType> createElement(CreateOrganizationRequestType value);
}

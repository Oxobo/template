package nl.tue.base.mq.request;

import nl.tue.base.dto.request.UpdateOrganizationRequestType;

import javax.xml.bind.JAXBElement;

public interface UpdateOrganizationRequestService {
    UpdateOrganizationRequestType createType();
    JAXBElement<UpdateOrganizationRequestType> createElement(UpdateOrganizationRequestType value);
}

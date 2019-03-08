package nl.tue.base.mq.request;

import nl.tue.base.dto.request.GetOrganizationsByNameRequestType;

import javax.xml.bind.JAXBElement;

public interface GetOrganizationsByNameRequestService {
    GetOrganizationsByNameRequestType createType();
    JAXBElement<GetOrganizationsByNameRequestType> createElement(GetOrganizationsByNameRequestType value);
}

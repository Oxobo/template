package nl.tue.base.mq.response;

import nl.tue.base.dto.response.CreateOrganizationResponseType;

import javax.xml.bind.JAXBElement;

public interface CreateOrganizationResponseService extends MqResponseBaseService {
    JAXBElement<CreateOrganizationResponseType>
                createElement(CreateOrganizationResponseType value);
}

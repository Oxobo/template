package nl.tue.base.mq.response;

import nl.tue.base.dto.response.UpdateOrganizationResponseType;

import javax.xml.bind.JAXBElement;

public interface UpdateOrganizationResponseService extends MqResponseBaseService {
    JAXBElement<UpdateOrganizationResponseType>
                createElement(UpdateOrganizationResponseType value);
}

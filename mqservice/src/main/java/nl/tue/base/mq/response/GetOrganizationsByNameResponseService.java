package nl.tue.base.mq.response;

import nl.tue.base.dto.response.GetOrganizationsByNameResponseType;

import javax.xml.bind.JAXBElement;

public interface GetOrganizationsByNameResponseService extends MqResponseBaseService {
    JAXBElement<GetOrganizationsByNameResponseType>
                createElement(GetOrganizationsByNameResponseType value);
}

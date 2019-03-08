package nl.tue.base.mq.response;

import nl.tue.base.dto.response.GetOrganizationByIdentifierResponseType;

import javax.xml.bind.JAXBElement;

public interface GetOrganizationByIdentifierResponseService extends MqResponseBaseService {
    JAXBElement<GetOrganizationByIdentifierResponseType>
                createElement(GetOrganizationByIdentifierResponseType value);
}

package nl.tue.base.mq.response;

import nl.tue.base.dto.response.GetPersonByIdentifierResponseType;

import javax.xml.bind.JAXBElement;

public interface GetPersonByIdentifierResponseService extends MqResponseBaseService {
    JAXBElement<GetPersonByIdentifierResponseType>
                createElement(GetPersonByIdentifierResponseType value);
}

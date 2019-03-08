package nl.tue.base.mq.response;

import nl.tue.base.dto.response.CreatePersonResponseType;

import javax.xml.bind.JAXBElement;

public interface CreatePersonResponseService extends MqResponseBaseService {
    JAXBElement<CreatePersonResponseType>
                createElement(CreatePersonResponseType value);
}

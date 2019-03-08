package nl.tue.base.mq.response;

import nl.tue.base.dto.response.GetPersonsByNameResponseType;

import javax.xml.bind.JAXBElement;

public interface GetPersonsByNameResponseService extends MqResponseBaseService {
    JAXBElement<GetPersonsByNameResponseType>
                createElement(GetPersonsByNameResponseType value);
}

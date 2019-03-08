package nl.tue.base.mq.response;

import nl.tue.base.dto.response.PartialBlockAccountResponseType;

import javax.xml.bind.JAXBElement;

public interface PartialBlockAccountResponseService extends MqResponseBaseService {
    JAXBElement<PartialBlockAccountResponseType>
                createElement(PartialBlockAccountResponseType value);
}

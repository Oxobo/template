package nl.tue.base.mq.response;

import nl.tue.base.dto.response.PingResponseType;

import javax.xml.bind.JAXBElement;

public interface PingResponseService extends MqResponseBaseService {
    JAXBElement<PingResponseType>
                createElement(PingResponseType value);
}

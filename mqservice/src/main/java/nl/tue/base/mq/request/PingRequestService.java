package nl.tue.base.mq.request;

import nl.tue.base.dto.request.PingRequestType;

import javax.xml.bind.JAXBElement;

public interface PingRequestService extends MqRequestServiceCreator {
    JAXBElement<PingRequestType> createElement(PingRequestType value);
}

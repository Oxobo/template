package nl.tue.base.mq.request;

import nl.tue.base.dto.request.AbstractRequestType;

public interface MqRequestServiceCreator {
    <T extends AbstractRequestType> T createType();

}

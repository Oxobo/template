package nl.tue.base.mq;

import nl.tue.base.dto.request.AbstractRequestType;

public interface MqManager<T extends AbstractRequestType> {
    void service(T request);
}

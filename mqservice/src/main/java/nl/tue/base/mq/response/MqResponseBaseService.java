package nl.tue.base.mq.response;

import nl.tue.base.dto.response.AbstractResponseType;

public interface MqResponseBaseService {
    <T extends AbstractResponseType> T createType();

}

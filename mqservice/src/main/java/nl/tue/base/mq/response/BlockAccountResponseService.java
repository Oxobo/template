package nl.tue.base.mq.response;

import nl.tue.base.dto.response.BlockAccountResponseType;

import javax.xml.bind.JAXBElement;

public interface BlockAccountResponseService extends MqResponseBaseService {
    JAXBElement<BlockAccountResponseType>
                createElement(BlockAccountResponseType value);
}

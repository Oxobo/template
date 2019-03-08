package nl.tue.base.mq.response;

import nl.tue.base.dto.response.BlockPartyResponseType;

import javax.xml.bind.JAXBElement;

public interface BlockPartyResponseService extends MqResponseBaseService {
    JAXBElement<BlockPartyResponseType>
                createElement(BlockPartyResponseType value);
}

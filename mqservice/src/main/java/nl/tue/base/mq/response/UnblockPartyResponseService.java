package nl.tue.base.mq.response;

import nl.tue.base.dto.response.UnblockPartyResponseType;

import javax.xml.bind.JAXBElement;

public interface UnblockPartyResponseService extends MqResponseBaseService {
    JAXBElement<UnblockPartyResponseType>
                createElement(UnblockPartyResponseType value);
}

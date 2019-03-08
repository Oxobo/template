package nl.tue.base.mq.response;

import nl.tue.base.dto.response.PartialUnblockAccountResponseType;

import javax.xml.bind.JAXBElement;

public interface PartialUnblockAccountResponseService extends MqResponseBaseService {
    JAXBElement<PartialUnblockAccountResponseType>
                createElement(PartialUnblockAccountResponseType value);
}

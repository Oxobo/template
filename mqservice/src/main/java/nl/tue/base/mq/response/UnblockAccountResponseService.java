package nl.tue.base.mq.response;

import nl.tue.base.dto.response.UnblockAccountResponseType;

import javax.xml.bind.JAXBElement;

public interface UnblockAccountResponseService extends MqResponseBaseService {
    JAXBElement<UnblockAccountResponseType>
                createElement(UnblockAccountResponseType value);
}

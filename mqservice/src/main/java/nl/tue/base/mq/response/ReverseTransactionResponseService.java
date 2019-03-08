package nl.tue.base.mq.response;

import nl.tue.base.dto.response.ReverseTransactionResponseType;

import javax.xml.bind.JAXBElement;

public interface ReverseTransactionResponseService extends MqResponseBaseService {
    JAXBElement<ReverseTransactionResponseType>
                createElement(ReverseTransactionResponseType value);
}

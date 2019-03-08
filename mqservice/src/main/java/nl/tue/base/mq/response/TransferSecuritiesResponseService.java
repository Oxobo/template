package nl.tue.base.mq.response;

import nl.tue.base.dto.response.TransferSecuritiesResponseType;

import javax.xml.bind.JAXBElement;

public interface TransferSecuritiesResponseService extends MqResponseBaseService {
    JAXBElement<TransferSecuritiesResponseType>
                createElement(TransferSecuritiesResponseType value);
}

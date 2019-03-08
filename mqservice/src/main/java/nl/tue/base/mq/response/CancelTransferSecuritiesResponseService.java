package nl.tue.base.mq.response;

import nl.tue.base.dto.response.CancelTransferSecuritiesResponseType;

import javax.xml.bind.JAXBElement;

public interface CancelTransferSecuritiesResponseService extends MqResponseBaseService {
    JAXBElement<CancelTransferSecuritiesResponseType>
                createElement(CancelTransferSecuritiesResponseType value);
}

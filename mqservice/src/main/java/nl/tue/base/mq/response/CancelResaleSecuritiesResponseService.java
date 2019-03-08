package nl.tue.base.mq.response;

import nl.tue.base.dto.response.CancelResaleSecuritiesResponseType;

import javax.xml.bind.JAXBElement;

public interface CancelResaleSecuritiesResponseService extends MqResponseBaseService {
    JAXBElement<CancelResaleSecuritiesResponseType>
                createElement(CancelResaleSecuritiesResponseType value);
}

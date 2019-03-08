package nl.tue.base.mq.response;

import nl.tue.base.dto.response.ResaleSecuritiesResponseType;

import javax.xml.bind.JAXBElement;

public interface ResaleSecuritiesResponseService extends MqResponseBaseService {
    JAXBElement<ResaleSecuritiesResponseType>
                createElement(ResaleSecuritiesResponseType value);
}

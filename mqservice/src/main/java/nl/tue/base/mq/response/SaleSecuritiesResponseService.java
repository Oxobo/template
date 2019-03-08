package nl.tue.base.mq.response;

import nl.tue.base.dto.response.SaleSecuritiesResponseType;

import javax.xml.bind.JAXBElement;

public interface SaleSecuritiesResponseService extends MqResponseBaseService {
    JAXBElement<SaleSecuritiesResponseType>
                createElement(SaleSecuritiesResponseType value);
}

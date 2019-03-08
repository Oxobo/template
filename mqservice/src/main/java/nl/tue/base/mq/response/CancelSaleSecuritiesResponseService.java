package nl.tue.base.mq.response;

import nl.tue.base.dto.response.CancelSaleSecuritiesResponseType;

import javax.xml.bind.JAXBElement;

public interface CancelSaleSecuritiesResponseService extends MqResponseBaseService {
    JAXBElement<CancelSaleSecuritiesResponseType>
                createElement(CancelSaleSecuritiesResponseType value);
}

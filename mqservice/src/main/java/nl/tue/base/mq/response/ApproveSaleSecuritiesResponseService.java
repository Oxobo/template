package nl.tue.base.mq.response;

import nl.tue.base.dto.response.ApproveSaleSecuritiesResponseType;

import javax.xml.bind.JAXBElement;

public interface ApproveSaleSecuritiesResponseService extends MqResponseBaseService {
    JAXBElement<ApproveSaleSecuritiesResponseType>
                createElement(ApproveSaleSecuritiesResponseType value);
}

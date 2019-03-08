package nl.tue.base.mq.response;

import nl.tue.base.dto.response.GetSecuritiesForSaleResponseType;

import javax.xml.bind.JAXBElement;

public interface GetSecuritiesForSaleResponseService extends MqResponseBaseService {
    JAXBElement<GetSecuritiesForSaleResponseType>
                createElement(GetSecuritiesForSaleResponseType value);
}

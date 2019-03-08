package nl.tue.base.mq.response;

import nl.tue.base.dto.response.GetSecuritiesCodesForSaleResponseType;

import javax.xml.bind.JAXBElement;

public interface GetSecuritiesCodesForSaleResponseService extends MqResponseBaseService {
    JAXBElement<GetSecuritiesCodesForSaleResponseType>
                createElement(GetSecuritiesCodesForSaleResponseType value);
}

package nl.tue.base.mq.response;

import nl.tue.base.dto.response.GetSecuritiesCodesForResaleResponseType;

import javax.xml.bind.JAXBElement;

public interface GetSecuritiesCodesForResaleResponseService extends MqResponseBaseService {
    JAXBElement<GetSecuritiesCodesForResaleResponseType>
                createElement(GetSecuritiesCodesForResaleResponseType value);
}

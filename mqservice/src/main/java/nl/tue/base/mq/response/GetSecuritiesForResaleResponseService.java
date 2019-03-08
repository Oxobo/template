package nl.tue.base.mq.response;

import nl.tue.base.dto.response.GetSecuritiesForResaleResponseType;

import javax.xml.bind.JAXBElement;

public interface GetSecuritiesForResaleResponseService extends MqResponseBaseService {
    JAXBElement<GetSecuritiesForResaleResponseType>
                createElement(GetSecuritiesForResaleResponseType value);
}

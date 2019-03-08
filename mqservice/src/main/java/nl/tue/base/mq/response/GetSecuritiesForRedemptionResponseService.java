package nl.tue.base.mq.response;

import nl.tue.base.dto.response.GetSecuritiesForRedemptionResponseType;

import javax.xml.bind.JAXBElement;

public interface GetSecuritiesForRedemptionResponseService extends MqResponseBaseService {
    JAXBElement<GetSecuritiesForRedemptionResponseType>
                createElement(GetSecuritiesForRedemptionResponseType value);
}

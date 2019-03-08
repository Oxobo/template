package nl.tue.base.mq.response;

import nl.tue.base.dto.response.GetSecuritiesCodesForRedemptionResponseType;

import javax.xml.bind.JAXBElement;

public interface GetSecuritiesCodesForRedemptionResponseService extends MqResponseBaseService {
    JAXBElement<GetSecuritiesCodesForRedemptionResponseType>
                createElement(GetSecuritiesCodesForRedemptionResponseType value);
}

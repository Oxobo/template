package nl.tue.base.mq.response;

import nl.tue.base.dto.response.GetRedemptionInterestResponseType;

import javax.xml.bind.JAXBElement;

public interface GetRedemptionInterestResponseService extends MqResponseBaseService {
    JAXBElement<GetRedemptionInterestResponseType>
                createElement(GetRedemptionInterestResponseType value);
}

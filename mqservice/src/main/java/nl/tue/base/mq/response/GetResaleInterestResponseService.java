package nl.tue.base.mq.response;

import nl.tue.base.dto.response.GetResaleInterestResponseType;

import javax.xml.bind.JAXBElement;

public interface GetResaleInterestResponseService extends MqResponseBaseService {
    JAXBElement<GetResaleInterestResponseType>
                createElement(GetResaleInterestResponseType value);
}

package nl.tue.base.mq.response;

import nl.tue.base.dto.response.GetAllocatedSecuritiesResponseType;

import javax.xml.bind.JAXBElement;

public interface GetAllocatedSecuritiesResponseService extends MqResponseBaseService {
    JAXBElement<GetAllocatedSecuritiesResponseType>
                createElement(GetAllocatedSecuritiesResponseType value);
}

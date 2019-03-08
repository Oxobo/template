package nl.tue.base.mq.response;

import nl.tue.base.dto.response.GetAllocatedSecuritiesCodesResponseType;

import javax.xml.bind.JAXBElement;

public interface GetAllocatedSecuritiesCodesResponseService extends MqResponseBaseService {
    JAXBElement<GetAllocatedSecuritiesCodesResponseType>
                createElement(GetAllocatedSecuritiesCodesResponseType value);
}

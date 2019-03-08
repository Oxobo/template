package nl.tue.base.mq.response;

import nl.tue.base.dto.response.GetSalesInterestResponseType;

import javax.xml.bind.JAXBElement;

public interface GetSalesInterestResponseService extends MqResponseBaseService {
    JAXBElement<GetSalesInterestResponseType>
                createElement(GetSalesInterestResponseType value);
}

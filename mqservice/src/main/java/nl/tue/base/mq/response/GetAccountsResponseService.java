package nl.tue.base.mq.response;

import nl.tue.base.dto.response.GetAccountsResponseType;

import javax.xml.bind.JAXBElement;

public interface GetAccountsResponseService extends MqResponseBaseService {
    JAXBElement<GetAccountsResponseType>
                createElement(GetAccountsResponseType value);
}

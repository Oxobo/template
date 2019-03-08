package nl.tue.base.mq.response;

import nl.tue.base.dto.response.GetSecuritiesCouponsDateResponseType;

import javax.xml.bind.JAXBElement;

public interface GetSecuritiesCouponsDateResponseService extends MqResponseBaseService {
    JAXBElement<GetSecuritiesCouponsDateResponseType>
                createElement(GetSecuritiesCouponsDateResponseType value);
}

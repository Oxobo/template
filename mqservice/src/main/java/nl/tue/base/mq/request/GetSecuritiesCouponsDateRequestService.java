package nl.tue.base.mq.request;

import nl.tue.base.dto.request.GetSecuritiesCouponsDateRequestType;

import javax.xml.bind.JAXBElement;

public interface GetSecuritiesCouponsDateRequestService {
    GetSecuritiesCouponsDateRequestType createType();
    JAXBElement<GetSecuritiesCouponsDateRequestType> createElement(GetSecuritiesCouponsDateRequestType value);
}

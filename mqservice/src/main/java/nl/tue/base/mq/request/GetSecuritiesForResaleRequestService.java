package nl.tue.base.mq.request;

import nl.tue.base.dto.request.GetSecuritiesForResaleRequestType;

import javax.xml.bind.JAXBElement;

public interface GetSecuritiesForResaleRequestService {
    GetSecuritiesForResaleRequestType createType();
    JAXBElement<GetSecuritiesForResaleRequestType> createElement(GetSecuritiesForResaleRequestType value);
}

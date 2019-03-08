package nl.tue.base.mq.request;

import nl.tue.base.dto.request.GetSecuritiesCodesForResaleRequestType;

import javax.xml.bind.JAXBElement;

public interface GetSecuritiesCodesForResaleRequestService {
    GetSecuritiesCodesForResaleRequestType createType();
    JAXBElement<GetSecuritiesCodesForResaleRequestType> createElement(GetSecuritiesCodesForResaleRequestType value);
}

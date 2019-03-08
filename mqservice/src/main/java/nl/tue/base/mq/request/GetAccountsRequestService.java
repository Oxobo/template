package nl.tue.base.mq.request;

import nl.tue.base.dto.request.GetAccountsRequestType;

import javax.xml.bind.JAXBElement;

public interface GetAccountsRequestService {
    GetAccountsRequestType createType();
    JAXBElement<GetAccountsRequestType> createElement(GetAccountsRequestType value);
}

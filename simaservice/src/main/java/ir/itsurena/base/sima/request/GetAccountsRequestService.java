package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.CreatePersonRequestType;
import ir.itsurena.base.dto.request.GetAccountsRequestType;

import javax.xml.bind.JAXBElement;

public interface GetAccountsRequestService {
    GetAccountsRequestType createType();
    JAXBElement<GetAccountsRequestType> createElement(GetAccountsRequestType value);
}

package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.GetAccountsRequestType;
import ir.itsurena.base.dto.request.GetAllocatedSecuritiesCodesRequestType;

import javax.xml.bind.JAXBElement;

public interface GetAllocatedSecuritiesCodesRequestService {
    GetAllocatedSecuritiesCodesRequestType createType();
    JAXBElement<GetAllocatedSecuritiesCodesRequestType> createElement(GetAllocatedSecuritiesCodesRequestType value);
}

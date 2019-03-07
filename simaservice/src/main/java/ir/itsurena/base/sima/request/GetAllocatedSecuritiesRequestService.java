package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.GetAllocatedSecuritiesCodesRequestType;
import ir.itsurena.base.dto.request.GetAllocatedSecuritiesRequestType;

import javax.xml.bind.JAXBElement;

public interface GetAllocatedSecuritiesRequestService {
    GetAllocatedSecuritiesRequestType createType();
    JAXBElement<GetAllocatedSecuritiesRequestType> createElement(GetAllocatedSecuritiesRequestType value);
}

package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.GetResaleInterestRequestType;
import ir.itsurena.base.dto.request.GetSalesInterestRequestType;

import javax.xml.bind.JAXBElement;

public interface GetSalesInterestRequestService {
    GetSalesInterestRequestType createType();
    JAXBElement<GetSalesInterestRequestType> createElement(GetSalesInterestRequestType value);
}

package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.GetRedemptionInterestRequestType;
import ir.itsurena.base.dto.request.GetResaleInterestRequestType;

import javax.xml.bind.JAXBElement;

public interface GetResaleInterestRequestService {
    GetResaleInterestRequestType createType();
    JAXBElement<GetResaleInterestRequestType> createElement(GetResaleInterestRequestType value);
}

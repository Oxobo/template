package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.GetPersonsByNameRequestType;
import ir.itsurena.base.dto.request.GetRedemptionInterestRequestType;

import javax.xml.bind.JAXBElement;

public interface GetRedemptionInterestRequestService {
    GetRedemptionInterestRequestType createType();
    JAXBElement<GetRedemptionInterestRequestType> createElement(GetRedemptionInterestRequestType value);
}

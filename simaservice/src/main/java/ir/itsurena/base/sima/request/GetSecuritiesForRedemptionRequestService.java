package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.GetSecuritiesCouponsDateRequestType;
import ir.itsurena.base.dto.request.GetSecuritiesForRedemptionRequestType;

import javax.xml.bind.JAXBElement;

public interface GetSecuritiesForRedemptionRequestService {
    GetSecuritiesForRedemptionRequestType createType();
    JAXBElement<GetSecuritiesForRedemptionRequestType> createElement(GetSecuritiesForRedemptionRequestType value);
}

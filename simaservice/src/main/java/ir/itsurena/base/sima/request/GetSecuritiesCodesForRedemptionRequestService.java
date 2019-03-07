package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.GetSalesInterestRequestType;
import ir.itsurena.base.dto.request.GetSecuritiesCodesForRedemptionRequestType;

import javax.xml.bind.JAXBElement;

public interface GetSecuritiesCodesForRedemptionRequestService {
    GetSecuritiesCodesForRedemptionRequestType createType();
    JAXBElement<GetSecuritiesCodesForRedemptionRequestType> createElement(GetSecuritiesCodesForRedemptionRequestType value);
}

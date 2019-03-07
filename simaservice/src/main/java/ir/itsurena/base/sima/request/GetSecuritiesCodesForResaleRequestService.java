package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.GetSecuritiesCodesForRedemptionRequestType;
import ir.itsurena.base.dto.request.GetSecuritiesCodesForResaleRequestType;

import javax.xml.bind.JAXBElement;

public interface GetSecuritiesCodesForResaleRequestService {
    GetSecuritiesCodesForResaleRequestType createType();
    JAXBElement<GetSecuritiesCodesForResaleRequestType> createElement(GetSecuritiesCodesForResaleRequestType value);
}

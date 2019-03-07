package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.GetSecuritiesForRedemptionRequestType;
import ir.itsurena.base.dto.request.GetSecuritiesForResaleRequestType;

import javax.xml.bind.JAXBElement;

public interface GetSecuritiesForResaleRequestService {
    GetSecuritiesForResaleRequestType createType();
    JAXBElement<GetSecuritiesForResaleRequestType> createElement(GetSecuritiesForResaleRequestType value);
}

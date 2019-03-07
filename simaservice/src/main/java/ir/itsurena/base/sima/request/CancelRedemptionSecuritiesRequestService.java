package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.CancelRedemptionSecuritiesRequestType;

import javax.xml.bind.JAXBElement;

public interface CancelRedemptionSecuritiesRequestService {
    CancelRedemptionSecuritiesRequestType createType();
    JAXBElement<CancelRedemptionSecuritiesRequestType> createElement(CancelRedemptionSecuritiesRequestType value);
}

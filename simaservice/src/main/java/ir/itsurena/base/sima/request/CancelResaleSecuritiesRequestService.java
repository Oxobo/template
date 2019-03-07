package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.CancelRedemptionSecuritiesRequestType;
import ir.itsurena.base.dto.request.CancelResaleSecuritiesRequestType;

import javax.xml.bind.JAXBElement;

public interface CancelResaleSecuritiesRequestService {
    CancelResaleSecuritiesRequestType createType();
    JAXBElement<CancelResaleSecuritiesRequestType> createElement(CancelResaleSecuritiesRequestType value);
}

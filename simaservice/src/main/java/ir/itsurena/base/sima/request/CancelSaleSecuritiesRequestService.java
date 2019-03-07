package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.CancelResaleSecuritiesRequestType;
import ir.itsurena.base.dto.request.CancelSaleSecuritiesRequestType;

import javax.xml.bind.JAXBElement;

public interface CancelSaleSecuritiesRequestService {
    CancelSaleSecuritiesRequestType createType();
    JAXBElement<CancelSaleSecuritiesRequestType> createElement(CancelSaleSecuritiesRequestType value);
}

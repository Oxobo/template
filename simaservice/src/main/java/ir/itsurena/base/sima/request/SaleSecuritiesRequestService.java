package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.ReverseTransactionRequestType;
import ir.itsurena.base.dto.request.SaleSecuritiesRequestType;

import javax.xml.bind.JAXBElement;

public interface SaleSecuritiesRequestService {
    SaleSecuritiesRequestType createType();
    JAXBElement<SaleSecuritiesRequestType> createElement(SaleSecuritiesRequestType value);
}

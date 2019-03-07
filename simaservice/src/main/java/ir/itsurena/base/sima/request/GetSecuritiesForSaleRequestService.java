package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.GetSecuritiesForResaleRequestType;
import ir.itsurena.base.dto.request.GetSecuritiesForSaleRequestType;

import javax.xml.bind.JAXBElement;

public interface GetSecuritiesForSaleRequestService {
    GetSecuritiesForSaleRequestType createType();
    JAXBElement<GetSecuritiesForSaleRequestType> createElement(GetSecuritiesForSaleRequestType value);
}

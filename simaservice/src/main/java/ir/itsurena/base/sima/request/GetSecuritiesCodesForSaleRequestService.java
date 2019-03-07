package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.GetSecuritiesCodesForResaleRequestType;
import ir.itsurena.base.dto.request.GetSecuritiesCodesForSaleRequestType;

import javax.xml.bind.JAXBElement;

public interface GetSecuritiesCodesForSaleRequestService {
    GetSecuritiesCodesForSaleRequestType createType();
    JAXBElement<GetSecuritiesCodesForSaleRequestType> createElement(GetSecuritiesCodesForSaleRequestType value);
}

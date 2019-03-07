package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.GetSecuritiesCodesForSaleRequestType;
import ir.itsurena.base.dto.request.GetSecuritiesCodesForTransferRequestType;

import javax.xml.bind.JAXBElement;

public interface GetSecuritiesCodesForTransferRequestService {
    GetSecuritiesCodesForTransferRequestType createType();
    JAXBElement<GetSecuritiesCodesForTransferRequestType> createElement(GetSecuritiesCodesForTransferRequestType value);
}

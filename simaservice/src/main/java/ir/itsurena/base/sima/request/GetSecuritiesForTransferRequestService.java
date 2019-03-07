package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.GetSecuritiesForSaleRequestType;
import ir.itsurena.base.dto.request.GetSecuritiesForTransferRequestType;

import javax.xml.bind.JAXBElement;

public interface GetSecuritiesForTransferRequestService {
    GetSecuritiesForTransferRequestType createType();
    JAXBElement<GetSecuritiesForTransferRequestType> createElement(GetSecuritiesForTransferRequestType value);
}

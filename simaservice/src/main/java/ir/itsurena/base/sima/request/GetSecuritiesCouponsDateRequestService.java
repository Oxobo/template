package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.GetSecuritiesCodesForTransferRequestType;
import ir.itsurena.base.dto.request.GetSecuritiesCouponsDateRequestType;

import javax.xml.bind.JAXBElement;

public interface GetSecuritiesCouponsDateRequestService {
    GetSecuritiesCouponsDateRequestType createType();
    JAXBElement<GetSecuritiesCouponsDateRequestType> createElement(GetSecuritiesCouponsDateRequestType value);
}

package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.ApproveSaleSecuritiesRequestType;

import javax.xml.bind.JAXBElement;

public interface ApproveSaleSecuritiesRequestService {

    ApproveSaleSecuritiesRequestType createType();
    JAXBElement<ApproveSaleSecuritiesRequestType> createElement(ApproveSaleSecuritiesRequestType value);
}

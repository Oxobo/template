package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.ApproveResaleSecuritiesRequestType;

import javax.xml.bind.JAXBElement;

public interface ApproveResaleSecuritiesRequestService {
    ApproveResaleSecuritiesRequestType createType();
    JAXBElement<ApproveResaleSecuritiesRequestType> createElement(ApproveResaleSecuritiesRequestType value);
}

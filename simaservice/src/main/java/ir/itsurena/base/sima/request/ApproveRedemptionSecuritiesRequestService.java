package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.ApproveRedemptionSecuritiesRequestType;

import javax.xml.bind.JAXBElement;

public interface ApproveRedemptionSecuritiesRequestService {
    ApproveRedemptionSecuritiesRequestType createType();
    JAXBElement<ApproveRedemptionSecuritiesRequestType> createElement(ApproveRedemptionSecuritiesRequestType value);
}

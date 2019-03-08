package nl.tue.base.mq.request;

import nl.tue.base.dto.request.ApproveRedemptionSecuritiesRequestType;

import javax.xml.bind.JAXBElement;

public interface ApproveRedemptionSecuritiesRequestService {
    ApproveRedemptionSecuritiesRequestType createType();
    JAXBElement<ApproveRedemptionSecuritiesRequestType> createElement(ApproveRedemptionSecuritiesRequestType value);
}

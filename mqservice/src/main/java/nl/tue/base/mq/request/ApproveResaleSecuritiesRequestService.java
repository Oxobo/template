package nl.tue.base.mq.request;

import nl.tue.base.dto.request.ApproveResaleSecuritiesRequestType;

import javax.xml.bind.JAXBElement;

public interface ApproveResaleSecuritiesRequestService {
    ApproveResaleSecuritiesRequestType createType();
    JAXBElement<ApproveResaleSecuritiesRequestType> createElement(ApproveResaleSecuritiesRequestType value);
}

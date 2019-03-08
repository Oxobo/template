package nl.tue.base.mq.request;

import nl.tue.base.dto.request.ApproveTransferSecuritiesRequestType;

import javax.xml.bind.JAXBElement;

public interface ApproveTransferSecuritiesRequestService {
    ApproveTransferSecuritiesRequestType createType();
    JAXBElement<ApproveTransferSecuritiesRequestType> createElement(ApproveTransferSecuritiesRequestType value);
}

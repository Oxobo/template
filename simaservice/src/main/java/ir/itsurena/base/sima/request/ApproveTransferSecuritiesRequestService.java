package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.ApproveTransferSecuritiesRequestType;

import javax.xml.bind.JAXBElement;

public interface ApproveTransferSecuritiesRequestService {
    ApproveTransferSecuritiesRequestType createType();
    JAXBElement<ApproveTransferSecuritiesRequestType> createElement(ApproveTransferSecuritiesRequestType value);
}

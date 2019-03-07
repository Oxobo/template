package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.CancelSaleSecuritiesRequestType;
import ir.itsurena.base.dto.request.CancelTransferSecuritiesRequestType;

import javax.xml.bind.JAXBElement;

public interface CancelTransferSecuritiesRequestService {
    CancelTransferSecuritiesRequestType createType();
    JAXBElement<CancelTransferSecuritiesRequestType> createElement(CancelTransferSecuritiesRequestType value);
}

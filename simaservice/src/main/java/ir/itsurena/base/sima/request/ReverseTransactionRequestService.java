package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.ResaleSecuritiesRequestType;
import ir.itsurena.base.dto.request.ReverseTransactionRequestType;

import javax.xml.bind.JAXBElement;

public interface ReverseTransactionRequestService {
    ReverseTransactionRequestType createType();
    JAXBElement<ReverseTransactionRequestType> createElement(ReverseTransactionRequestType value);
}

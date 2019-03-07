package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.GetSecuritiesForTransferRequestType;
import ir.itsurena.base.dto.request.PartialBlockAccountRequestType;

import javax.xml.bind.JAXBElement;

public interface PartialBlockAccountRequestService {
    PartialBlockAccountRequestType createType();
    JAXBElement<PartialBlockAccountRequestType> createElement(PartialBlockAccountRequestType value);
}

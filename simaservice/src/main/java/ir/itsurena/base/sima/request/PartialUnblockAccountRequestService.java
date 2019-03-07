package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.PartialBlockAccountRequestType;
import ir.itsurena.base.dto.request.PartialUnblockAccountRequestType;

import javax.xml.bind.JAXBElement;

public interface PartialUnblockAccountRequestService {
    PartialUnblockAccountRequestType createType();
    JAXBElement<PartialUnblockAccountRequestType> createElement(PartialUnblockAccountRequestType value);
}

package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.PingRequestType;

import javax.xml.bind.JAXBElement;

public interface PingRequestService extends SimaRequestServiceCreator {
    JAXBElement<PingRequestType> createElement(PingRequestType value);
}

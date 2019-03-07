package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.ResaleSecuritiesRequestType;

import javax.xml.bind.JAXBElement;

public interface ResaleSecuritiesRequestService {
    ResaleSecuritiesRequestType createType();
    JAXBElement<ResaleSecuritiesRequestType> createElement(ResaleSecuritiesRequestType value);
}

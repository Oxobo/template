package nl.tue.base.mq.request;

import nl.tue.base.dto.request.ResaleSecuritiesRequestType;

import javax.xml.bind.JAXBElement;

public interface ResaleSecuritiesRequestService {
    ResaleSecuritiesRequestType createType();
    JAXBElement<ResaleSecuritiesRequestType> createElement(ResaleSecuritiesRequestType value);
}

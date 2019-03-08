package nl.tue.base.mq.request;

import nl.tue.base.dto.request.GetAllocatedSecuritiesRequestType;

import javax.xml.bind.JAXBElement;

public interface GetAllocatedSecuritiesRequestService {
    GetAllocatedSecuritiesRequestType createType();
    JAXBElement<GetAllocatedSecuritiesRequestType> createElement(GetAllocatedSecuritiesRequestType value);
}

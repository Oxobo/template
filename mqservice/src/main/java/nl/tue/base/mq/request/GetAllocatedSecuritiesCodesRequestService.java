package nl.tue.base.mq.request;

import nl.tue.base.dto.request.GetAllocatedSecuritiesCodesRequestType;

import javax.xml.bind.JAXBElement;

public interface GetAllocatedSecuritiesCodesRequestService {
    GetAllocatedSecuritiesCodesRequestType createType();
    JAXBElement<GetAllocatedSecuritiesCodesRequestType> createElement(GetAllocatedSecuritiesCodesRequestType value);
}

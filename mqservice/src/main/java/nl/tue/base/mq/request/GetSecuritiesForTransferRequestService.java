package nl.tue.base.mq.request;

import nl.tue.base.dto.request.GetSecuritiesForTransferRequestType;

import javax.xml.bind.JAXBElement;

public interface GetSecuritiesForTransferRequestService {
    GetSecuritiesForTransferRequestType createType();
    JAXBElement<GetSecuritiesForTransferRequestType> createElement(GetSecuritiesForTransferRequestType value);
}

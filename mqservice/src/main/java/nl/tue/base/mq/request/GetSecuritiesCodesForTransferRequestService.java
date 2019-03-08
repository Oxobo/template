package nl.tue.base.mq.request;

import nl.tue.base.dto.request.GetSecuritiesCodesForTransferRequestType;

import javax.xml.bind.JAXBElement;

public interface GetSecuritiesCodesForTransferRequestService {
    GetSecuritiesCodesForTransferRequestType createType();
    JAXBElement<GetSecuritiesCodesForTransferRequestType> createElement(GetSecuritiesCodesForTransferRequestType value);
}

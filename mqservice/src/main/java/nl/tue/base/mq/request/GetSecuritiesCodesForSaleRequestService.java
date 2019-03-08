package nl.tue.base.mq.request;

import nl.tue.base.dto.request.GetSecuritiesCodesForSaleRequestType;

import javax.xml.bind.JAXBElement;

public interface GetSecuritiesCodesForSaleRequestService {
    GetSecuritiesCodesForSaleRequestType createType();
    JAXBElement<GetSecuritiesCodesForSaleRequestType> createElement(GetSecuritiesCodesForSaleRequestType value);
}

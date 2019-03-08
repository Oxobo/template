package nl.tue.base.mq.request;

import nl.tue.base.dto.request.ReverseTransactionRequestType;

import javax.xml.bind.JAXBElement;

public interface ReverseTransactionRequestService {
    ReverseTransactionRequestType createType();
    JAXBElement<ReverseTransactionRequestType> createElement(ReverseTransactionRequestType value);
}

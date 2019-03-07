package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.ReverseTransactionResponseType;

import javax.xml.bind.JAXBElement;

public interface ReverseTransactionResponseService extends SimaResponseBaseService {
    JAXBElement<ReverseTransactionResponseType>
                createElement(ReverseTransactionResponseType value);
}

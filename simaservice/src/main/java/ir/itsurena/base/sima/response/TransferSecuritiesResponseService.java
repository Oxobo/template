package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.TransferSecuritiesResponseType;

import javax.xml.bind.JAXBElement;

public interface TransferSecuritiesResponseService extends SimaResponseBaseService {
    JAXBElement<TransferSecuritiesResponseType>
                createElement(TransferSecuritiesResponseType value);
}

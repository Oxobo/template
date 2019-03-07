package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.CancelTransferSecuritiesResponseType;

import javax.xml.bind.JAXBElement;

public interface CancelTransferSecuritiesResponseService extends SimaResponseBaseService {
    JAXBElement<CancelTransferSecuritiesResponseType>
                createElement(CancelTransferSecuritiesResponseType value);
}

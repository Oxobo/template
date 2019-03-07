package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.CancelResaleSecuritiesResponseType;

import javax.xml.bind.JAXBElement;

public interface CancelResaleSecuritiesResponseService extends SimaResponseBaseService {
    JAXBElement<CancelResaleSecuritiesResponseType>
                createElement(CancelResaleSecuritiesResponseType value);
}

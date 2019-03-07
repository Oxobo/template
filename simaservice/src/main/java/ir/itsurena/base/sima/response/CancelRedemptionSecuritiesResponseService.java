package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.CancelRedemptionSecuritiesResponseType;

import javax.xml.bind.JAXBElement;

public interface CancelRedemptionSecuritiesResponseService extends SimaResponseBaseService {
    JAXBElement<CancelRedemptionSecuritiesResponseType>
                createElement(CancelRedemptionSecuritiesResponseType value);
}

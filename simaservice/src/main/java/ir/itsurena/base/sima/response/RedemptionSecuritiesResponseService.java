package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.RedemptionSecuritiesResponseType;

import javax.xml.bind.JAXBElement;

public interface RedemptionSecuritiesResponseService extends SimaResponseBaseService {
    JAXBElement<RedemptionSecuritiesResponseType>
                createElement(RedemptionSecuritiesResponseType value);
}

package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.ApproveRedemptionSecuritiesResponseType;

import javax.xml.bind.JAXBElement;

public interface ApproveRedemptionSecuritiesResponseService extends SimaResponseBaseService {
    JAXBElement<ApproveRedemptionSecuritiesResponseType>
                createElement(ApproveRedemptionSecuritiesResponseType value);
}

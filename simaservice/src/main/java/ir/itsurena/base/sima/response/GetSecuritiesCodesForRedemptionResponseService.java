package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.GetSecuritiesCodesForRedemptionResponseType;

import javax.xml.bind.JAXBElement;

public interface GetSecuritiesCodesForRedemptionResponseService extends SimaResponseBaseService {
    JAXBElement<GetSecuritiesCodesForRedemptionResponseType>
                createElement(GetSecuritiesCodesForRedemptionResponseType value);
}

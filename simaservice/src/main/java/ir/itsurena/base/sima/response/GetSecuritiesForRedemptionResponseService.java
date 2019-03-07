package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.GetSecuritiesForRedemptionResponseType;

import javax.xml.bind.JAXBElement;

public interface GetSecuritiesForRedemptionResponseService extends SimaResponseBaseService {
    JAXBElement<GetSecuritiesForRedemptionResponseType>
                createElement(GetSecuritiesForRedemptionResponseType value);
}

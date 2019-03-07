package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.GetRedemptionInterestResponseType;

import javax.xml.bind.JAXBElement;

public interface GetRedemptionInterestResponseService extends SimaResponseBaseService {
    JAXBElement<GetRedemptionInterestResponseType>
                createElement(GetRedemptionInterestResponseType value);
}

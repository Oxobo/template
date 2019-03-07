package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.GetSecuritiesCodesForResaleResponseType;

import javax.xml.bind.JAXBElement;

public interface GetSecuritiesCodesForResaleResponseService extends SimaResponseBaseService {
    JAXBElement<GetSecuritiesCodesForResaleResponseType>
                createElement(GetSecuritiesCodesForResaleResponseType value);
}

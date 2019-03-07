package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.GetSecuritiesForResaleResponseType;

import javax.xml.bind.JAXBElement;

public interface GetSecuritiesForResaleResponseService extends SimaResponseBaseService {
    JAXBElement<GetSecuritiesForResaleResponseType>
                createElement(GetSecuritiesForResaleResponseType value);
}

package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.GetSecuritiesForSaleResponseType;

import javax.xml.bind.JAXBElement;

public interface GetSecuritiesForSaleResponseService extends SimaResponseBaseService {
    JAXBElement<GetSecuritiesForSaleResponseType>
                createElement(GetSecuritiesForSaleResponseType value);
}

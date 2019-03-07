package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.GetSecuritiesCodesForSaleResponseType;

import javax.xml.bind.JAXBElement;

public interface GetSecuritiesCodesForSaleResponseService extends SimaResponseBaseService {
    JAXBElement<GetSecuritiesCodesForSaleResponseType>
                createElement(GetSecuritiesCodesForSaleResponseType value);
}

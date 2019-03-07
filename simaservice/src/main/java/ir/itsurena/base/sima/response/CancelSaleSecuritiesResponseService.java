package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.CancelSaleSecuritiesResponseType;

import javax.xml.bind.JAXBElement;

public interface CancelSaleSecuritiesResponseService extends SimaResponseBaseService {
    JAXBElement<CancelSaleSecuritiesResponseType>
                createElement(CancelSaleSecuritiesResponseType value);
}

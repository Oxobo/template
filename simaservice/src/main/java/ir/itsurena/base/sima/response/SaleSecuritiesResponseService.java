package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.SaleSecuritiesResponseType;

import javax.xml.bind.JAXBElement;

public interface SaleSecuritiesResponseService extends SimaResponseBaseService {
    JAXBElement<SaleSecuritiesResponseType>
                createElement(SaleSecuritiesResponseType value);
}

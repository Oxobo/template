package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.ApproveSaleSecuritiesResponseType;

import javax.xml.bind.JAXBElement;

public interface ApproveSaleSecuritiesResponseService extends SimaResponseBaseService {
    JAXBElement<ApproveSaleSecuritiesResponseType>
                createElement(ApproveSaleSecuritiesResponseType value);
}

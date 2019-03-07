package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.PingRequestType;
import ir.itsurena.base.dto.request.RedemptionSecuritiesRequestType;

import javax.xml.bind.JAXBElement;

public interface RedemptionSecuritiesRequestService {
    RedemptionSecuritiesRequestType createType();
    JAXBElement<RedemptionSecuritiesRequestType> createElement(RedemptionSecuritiesRequestType value);
}

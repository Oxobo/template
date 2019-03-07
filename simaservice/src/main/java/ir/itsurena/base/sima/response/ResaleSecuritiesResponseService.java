package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.ResaleSecuritiesResponseType;

import javax.xml.bind.JAXBElement;

public interface ResaleSecuritiesResponseService extends SimaResponseBaseService {
    JAXBElement<ResaleSecuritiesResponseType>
                createElement(ResaleSecuritiesResponseType value);
}

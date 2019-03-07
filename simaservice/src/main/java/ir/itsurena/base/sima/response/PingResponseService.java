package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.PingResponseType;

import javax.xml.bind.JAXBElement;

public interface PingResponseService extends SimaResponseBaseService {
    JAXBElement<PingResponseType>
                createElement(PingResponseType value);
}

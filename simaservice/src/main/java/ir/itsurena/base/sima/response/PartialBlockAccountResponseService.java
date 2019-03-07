package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.PartialBlockAccountResponseType;

import javax.xml.bind.JAXBElement;

public interface PartialBlockAccountResponseService extends SimaResponseBaseService {
    JAXBElement<PartialBlockAccountResponseType>
                createElement(PartialBlockAccountResponseType value);
}

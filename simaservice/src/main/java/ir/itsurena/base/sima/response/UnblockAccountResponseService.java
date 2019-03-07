package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.UnblockAccountResponseType;

import javax.xml.bind.JAXBElement;

public interface UnblockAccountResponseService extends SimaResponseBaseService {
    JAXBElement<UnblockAccountResponseType>
                createElement(UnblockAccountResponseType value);
}

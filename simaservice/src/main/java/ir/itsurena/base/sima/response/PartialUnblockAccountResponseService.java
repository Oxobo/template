package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.PartialUnblockAccountResponseType;

import javax.xml.bind.JAXBElement;

public interface PartialUnblockAccountResponseService extends SimaResponseBaseService {
    JAXBElement<PartialUnblockAccountResponseType>
                createElement(PartialUnblockAccountResponseType value);
}

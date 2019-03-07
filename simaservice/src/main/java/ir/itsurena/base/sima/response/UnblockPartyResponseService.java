package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.UnblockPartyResponseType;

import javax.xml.bind.JAXBElement;

public interface UnblockPartyResponseService extends SimaResponseBaseService {
    JAXBElement<UnblockPartyResponseType>
                createElement(UnblockPartyResponseType value);
}

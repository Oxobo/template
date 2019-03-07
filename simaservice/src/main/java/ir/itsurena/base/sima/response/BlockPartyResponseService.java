package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.BlockPartyResponseType;

import javax.xml.bind.JAXBElement;

public interface BlockPartyResponseService extends SimaResponseBaseService {
    JAXBElement<BlockPartyResponseType>
                createElement(BlockPartyResponseType value);
}

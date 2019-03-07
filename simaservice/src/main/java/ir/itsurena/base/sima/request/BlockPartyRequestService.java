package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.BlockPartyRequestType;

import javax.xml.bind.JAXBElement;

public interface BlockPartyRequestService {
    BlockPartyRequestType createType();
    JAXBElement<BlockPartyRequestType> createElement(BlockPartyRequestType value);
}

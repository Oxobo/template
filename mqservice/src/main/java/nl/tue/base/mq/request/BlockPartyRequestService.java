package nl.tue.base.mq.request;

import nl.tue.base.dto.request.BlockPartyRequestType;

import javax.xml.bind.JAXBElement;

public interface BlockPartyRequestService {
    BlockPartyRequestType createType();
    JAXBElement<BlockPartyRequestType> createElement(BlockPartyRequestType value);
}

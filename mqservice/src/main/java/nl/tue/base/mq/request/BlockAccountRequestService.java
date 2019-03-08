package nl.tue.base.mq.request;

import nl.tue.base.dto.request.BlockAccountRequestType;

import javax.xml.bind.JAXBElement;

public interface BlockAccountRequestService {
    BlockAccountRequestType createType();
    JAXBElement<BlockAccountRequestType> createElement(BlockAccountRequestType value);
}

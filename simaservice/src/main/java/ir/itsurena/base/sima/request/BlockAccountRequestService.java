package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.BlockAccountRequestType;
import ir.itsurena.base.dto.request.UnblockAccountRequestType;

import javax.xml.bind.JAXBElement;

public interface BlockAccountRequestService {
    BlockAccountRequestType createType();
    JAXBElement<BlockAccountRequestType> createElement(BlockAccountRequestType value);
}

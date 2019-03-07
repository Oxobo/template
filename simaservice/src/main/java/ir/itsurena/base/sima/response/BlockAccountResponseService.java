package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.BlockAccountResponseType;

import javax.xml.bind.JAXBElement;

public interface BlockAccountResponseService extends SimaResponseBaseService {
    JAXBElement<BlockAccountResponseType>
                createElement(BlockAccountResponseType value);
}

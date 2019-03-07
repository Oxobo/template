package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.BlockAccountRequestType;
import ir.itsurena.base.dto.request.BlockPartyRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.BlockAccountRequestService;
import ir.itsurena.base.sima.request.BlockPartyRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class BlockPartyRequestServiceImpl implements BlockPartyRequestService {

    @Autowired
    private SimaObjectFactory simaObjectFactory;

    @Override
    public BlockPartyRequestType createType() {
        return simaObjectFactory.createBlockPartyRequestType();
    }

    @Override
    public JAXBElement<BlockPartyRequestType> createElement(BlockPartyRequestType value) {
        return simaObjectFactory.createBlockPartyRequest(value);
    }
}

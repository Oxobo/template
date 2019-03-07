package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.BlockAccountRequestType;
import ir.itsurena.base.dto.request.UnblockAccountRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.BlockAccountRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class BlockAccountRequestServiceImpl implements BlockAccountRequestService {

    @Autowired
    private SimaObjectFactory simaObjectFactory;

    @Override
    public BlockAccountRequestType createType() {
        return simaObjectFactory.createBlockAccountRequestType();
    }

    @Override
    public JAXBElement<BlockAccountRequestType> createElement(BlockAccountRequestType value) {
        return simaObjectFactory.createBlockAccountRequest(value);
    }
}

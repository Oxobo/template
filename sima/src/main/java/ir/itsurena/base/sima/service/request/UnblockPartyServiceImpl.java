package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.UnblockPartyRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.UnblockPartyRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class UnblockPartyServiceImpl implements UnblockPartyRequestService {


    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public UnblockPartyServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }

    @Override
    public UnblockPartyRequestType createType() {
        return simaObjectFactory.createUnblockPartyRequestType();
    }

    @Override
    public JAXBElement<UnblockPartyRequestType> createElement(UnblockPartyRequestType value) {
        return simaObjectFactory.createUnblockPartyRequest(value);
    }
}

package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.UnblockAccountRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.UnblockAccountRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class UnblockAccountServiceImpl implements UnblockAccountRequestService {


    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public UnblockAccountServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }

    @Override
    public UnblockAccountRequestType createType() {
        return simaObjectFactory.createUnblockAccountRequestType();
    }

    @Override
    public JAXBElement<UnblockAccountRequestType> createElement(UnblockAccountRequestType value) {
        return simaObjectFactory.createUnblockAccountRequest(value);
    }
}

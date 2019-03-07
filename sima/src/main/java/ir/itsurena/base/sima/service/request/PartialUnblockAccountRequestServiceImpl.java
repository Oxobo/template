package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.PartialBlockAccountRequestType;
import ir.itsurena.base.dto.request.PartialUnblockAccountRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.PartialBlockAccountRequestService;
import ir.itsurena.base.sima.request.PartialUnblockAccountRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class PartialUnblockAccountRequestServiceImpl implements PartialUnblockAccountRequestService {

    @Autowired
    private SimaObjectFactory simaObjectFactory;

    @Override
    public PartialUnblockAccountRequestType createType() {
        return simaObjectFactory.createPartialUnblockAccountRequestType();
    }

    @Override
    public JAXBElement<PartialUnblockAccountRequestType> createElement(PartialUnblockAccountRequestType value) {
        return simaObjectFactory.createPartialUnblockAccountRequest(value);
    }
}

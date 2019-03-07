package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.PingRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.PingRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class PingRequestServiceImpl implements PingRequestService {

    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public PingRequestServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }

    @Override
    public PingRequestType createType() {
        return simaObjectFactory.createPingRequestType();
    }

    @Override
    public JAXBElement<PingRequestType> createElement(PingRequestType value) {
        return simaObjectFactory.createPingRequest(value);
    }
}

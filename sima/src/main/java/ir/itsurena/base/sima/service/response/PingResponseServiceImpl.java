package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.PingResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.PingResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class PingResponseServiceImpl
                    implements PingResponseService {

    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public PingResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<PingResponseType> 
                createElement(PingResponseType value) {
        return simaObjectFactory.createPingResponse(value);
    }

    @Override
    public PingResponseType createType() {
        return simaObjectFactory.createPingResponseType();
    }
}

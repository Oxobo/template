package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.UnblockPartyResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.UnblockPartyResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class UnblockPartyResponseServiceImpl
                    implements UnblockPartyResponseService {

    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public UnblockPartyResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<UnblockPartyResponseType> 
                createElement(UnblockPartyResponseType value) {
        return simaObjectFactory.createUnblockPartyResponse(value);
    }

    @Override
    public UnblockPartyResponseType createType() {
        return simaObjectFactory.createUnblockPartyResponseType();
    }
}

package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.PartialUnblockAccountResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.PartialUnblockAccountResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class PartialUnblockAccountResponseServiceImpl
                    implements PartialUnblockAccountResponseService {

    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public PartialUnblockAccountResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<PartialUnblockAccountResponseType> 
                createElement(PartialUnblockAccountResponseType value) {
        return simaObjectFactory.createPartialUnblockAccountResponse(value);
    }

    @Override
    public PartialUnblockAccountResponseType createType() {
        return simaObjectFactory.createPartialUnblockAccountResponseType();
    }
}

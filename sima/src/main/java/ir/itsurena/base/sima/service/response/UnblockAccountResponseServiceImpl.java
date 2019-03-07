package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.UnblockAccountResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.UnblockAccountResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class UnblockAccountResponseServiceImpl
                    implements UnblockAccountResponseService {

    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public UnblockAccountResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<UnblockAccountResponseType> 
                createElement(UnblockAccountResponseType value) {
        return simaObjectFactory.createUnblockAccountResponse(value);
    }

    @Override
    public UnblockAccountResponseType createType() {
        return simaObjectFactory.createUnblockAccountResponseType();
    }
}

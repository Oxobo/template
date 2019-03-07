package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.CreatePersonResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.CreatePersonResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetAccountsResponseServiceImpl implements CreatePersonResponseService {

    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public GetAccountsResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<CreatePersonResponseType> 
                createElement(CreatePersonResponseType value) {
        return simaObjectFactory.createCreatePersonResponse(value);
    }

    @Override
    public CreatePersonResponseType createType() {
        return simaObjectFactory.createCreatePersonResponseType();
    }
}

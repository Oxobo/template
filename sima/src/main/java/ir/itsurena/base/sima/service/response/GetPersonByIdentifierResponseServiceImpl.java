package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.GetPersonByIdentifierResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.GetPersonByIdentifierResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetPersonByIdentifierResponseServiceImpl implements GetPersonByIdentifierResponseService {

    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public GetPersonByIdentifierResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<GetPersonByIdentifierResponseType> 
                createElement(GetPersonByIdentifierResponseType value) {
        return simaObjectFactory.createGetPersonByIdentifierResponse(value);
    }

    @Override
    public GetPersonByIdentifierResponseType createType() {
        return simaObjectFactory.createGetPersonByIdentifierResponseType();
    }
}

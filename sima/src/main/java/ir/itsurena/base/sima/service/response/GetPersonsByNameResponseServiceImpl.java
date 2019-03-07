package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.GetPersonsByNameResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.GetPersonsByNameResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetPersonsByNameResponseServiceImpl implements GetPersonsByNameResponseService {

    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public GetPersonsByNameResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<GetPersonsByNameResponseType> 
                createElement(GetPersonsByNameResponseType value) {
        return simaObjectFactory.createGetPersonsByNameResponse(value);
    }

    @Override
    public GetPersonsByNameResponseType createType() {
        return simaObjectFactory.createGetPersonsByNameResponseType();
    }
}

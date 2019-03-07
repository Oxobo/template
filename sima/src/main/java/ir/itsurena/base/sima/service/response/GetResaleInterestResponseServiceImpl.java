package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.GetResaleInterestResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.GetResaleInterestResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetResaleInterestResponseServiceImpl implements GetResaleInterestResponseService {

    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public GetResaleInterestResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<GetResaleInterestResponseType> 
                createElement(GetResaleInterestResponseType value) {
        return simaObjectFactory.createGetResaleInterestResponse(value);
    }

    @Override
    public GetResaleInterestResponseType createType() {
        return simaObjectFactory.createGetResaleInterestResponseType();
    }
}

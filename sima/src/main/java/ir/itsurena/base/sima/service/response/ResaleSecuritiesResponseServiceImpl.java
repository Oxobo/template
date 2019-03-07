package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.ResaleSecuritiesResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.ResaleSecuritiesResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class ResaleSecuritiesResponseServiceImpl
                    implements ResaleSecuritiesResponseService {

    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public ResaleSecuritiesResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<ResaleSecuritiesResponseType> 
                createElement(ResaleSecuritiesResponseType value) {
        return simaObjectFactory.createResaleSecuritiesResponse(value);
    }

    @Override
    public ResaleSecuritiesResponseType createType() {
        return simaObjectFactory.createResaleSecuritiesResponseType();
    }
}
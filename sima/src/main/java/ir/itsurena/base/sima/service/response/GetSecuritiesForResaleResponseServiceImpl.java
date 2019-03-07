package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.GetSecuritiesForResaleResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.GetSecuritiesForResaleResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSecuritiesForResaleResponseServiceImpl
                    implements GetSecuritiesForResaleResponseService {

    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public GetSecuritiesForResaleResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<GetSecuritiesForResaleResponseType> 
                createElement(GetSecuritiesForResaleResponseType value) {
        return simaObjectFactory.createGetSecuritiesForResaleResponse(value);
    }

    @Override
    public GetSecuritiesForResaleResponseType createType() {
        return simaObjectFactory.createGetSecuritiesForResaleResponseType();
    }
}

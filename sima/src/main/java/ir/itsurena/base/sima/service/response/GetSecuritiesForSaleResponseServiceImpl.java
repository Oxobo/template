package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.GetSecuritiesForSaleResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.GetSecuritiesForSaleResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSecuritiesForSaleResponseServiceImpl
                    implements GetSecuritiesForSaleResponseService {

    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public GetSecuritiesForSaleResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<GetSecuritiesForSaleResponseType> 
                createElement(GetSecuritiesForSaleResponseType value) {
        return simaObjectFactory.createGetSecuritiesForSaleResponse(value);
    }

    @Override
    public GetSecuritiesForSaleResponseType createType() {
        return simaObjectFactory.createGetSecuritiesForSaleResponseType();
    }
}

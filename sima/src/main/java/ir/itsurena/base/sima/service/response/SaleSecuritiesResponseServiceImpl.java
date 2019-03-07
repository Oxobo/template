package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.SaleSecuritiesResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.SaleSecuritiesResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class SaleSecuritiesResponseServiceImpl
                    implements SaleSecuritiesResponseService {

    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public SaleSecuritiesResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<SaleSecuritiesResponseType> 
                createElement(SaleSecuritiesResponseType value) {
        return simaObjectFactory.createSaleSecuritiesResponse(value);
    }

    @Override
    public SaleSecuritiesResponseType createType() {
        return simaObjectFactory.createSaleSecuritiesResponseType();
    }
}

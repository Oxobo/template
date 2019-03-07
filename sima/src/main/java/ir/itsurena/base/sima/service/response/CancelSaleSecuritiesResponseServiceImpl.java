package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.CancelSaleSecuritiesResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.CancelSaleSecuritiesResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class CancelSaleSecuritiesResponseServiceImpl implements CancelSaleSecuritiesResponseService {
    
    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public CancelSaleSecuritiesResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<CancelSaleSecuritiesResponseType> 
                createElement(CancelSaleSecuritiesResponseType value) {
        return simaObjectFactory.createCancelSaleSecuritiesResponse(value);
    }

    @Override
    public CancelSaleSecuritiesResponseType createType() {
        return simaObjectFactory.createCancelSaleSecuritiesResponseType();
    }
}

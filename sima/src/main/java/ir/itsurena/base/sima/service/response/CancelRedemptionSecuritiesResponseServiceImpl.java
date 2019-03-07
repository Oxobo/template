package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.CancelRedemptionSecuritiesResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.CancelRedemptionSecuritiesResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class CancelRedemptionSecuritiesResponseServiceImpl implements CancelRedemptionSecuritiesResponseService {
    
    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public CancelRedemptionSecuritiesResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<CancelRedemptionSecuritiesResponseType> 
                createElement(CancelRedemptionSecuritiesResponseType value) {
        return simaObjectFactory.createCancelRedemptionSecuritiesResponse(value);
    }

    @Override
    public CancelRedemptionSecuritiesResponseType createType() {
        return simaObjectFactory.createCancelRedemptionSecuritiesResponseType();
    }
}

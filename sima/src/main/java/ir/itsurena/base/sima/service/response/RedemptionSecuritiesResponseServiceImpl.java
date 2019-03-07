package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.RedemptionSecuritiesResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.RedemptionSecuritiesResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class RedemptionSecuritiesResponseServiceImpl
                    implements RedemptionSecuritiesResponseService {

    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public RedemptionSecuritiesResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<RedemptionSecuritiesResponseType> 
                createElement(RedemptionSecuritiesResponseType value) {
        return simaObjectFactory.createRedemptionSecuritiesResponse(value);
    }

    @Override
    public RedemptionSecuritiesResponseType createType() {
        return simaObjectFactory.createRedemptionSecuritiesResponseType();
    }
}

package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.GetSecuritiesForRedemptionResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.GetSecuritiesForRedemptionResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSecuritiesForRedemptionResponseServiceImpl
                    implements GetSecuritiesForRedemptionResponseService {

    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public GetSecuritiesForRedemptionResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<GetSecuritiesForRedemptionResponseType> 
                createElement(GetSecuritiesForRedemptionResponseType value) {
        return simaObjectFactory.createGetSecuritiesForRedemptionResponse(value);
    }

    @Override
    public GetSecuritiesForRedemptionResponseType createType() {
        return simaObjectFactory.createGetSecuritiesForRedemptionResponseType();
    }
}

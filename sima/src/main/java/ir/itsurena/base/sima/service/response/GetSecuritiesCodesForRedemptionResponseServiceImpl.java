package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.GetSecuritiesCodesForRedemptionResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.GetSecuritiesCodesForRedemptionResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSecuritiesCodesForRedemptionResponseServiceImpl
                    implements GetSecuritiesCodesForRedemptionResponseService {

    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public GetSecuritiesCodesForRedemptionResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<GetSecuritiesCodesForRedemptionResponseType> 
                createElement(GetSecuritiesCodesForRedemptionResponseType value) {
        return simaObjectFactory.createGetSecuritiesCodesForRedemptionResponse(value);
    }

    @Override
    public GetSecuritiesCodesForRedemptionResponseType createType() {
        return simaObjectFactory.createGetSecuritiesCodesForRedemptionResponseType();
    }
}

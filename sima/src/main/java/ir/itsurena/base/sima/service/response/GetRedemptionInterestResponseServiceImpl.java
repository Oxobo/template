package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.GetRedemptionInterestResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.GetRedemptionInterestResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetRedemptionInterestResponseServiceImpl implements GetRedemptionInterestResponseService {

    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public GetRedemptionInterestResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<GetRedemptionInterestResponseType> 
                createElement(GetRedemptionInterestResponseType value) {
        return simaObjectFactory.createGetRedemptionInterestResponse(value);
    }

    @Override
    public GetRedemptionInterestResponseType createType() {
        return simaObjectFactory.createGetRedemptionInterestResponseType();
    }
}

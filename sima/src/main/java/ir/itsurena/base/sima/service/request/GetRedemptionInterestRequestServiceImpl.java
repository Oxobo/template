package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.GetPersonsByNameRequestType;
import ir.itsurena.base.dto.request.GetRedemptionInterestRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.GetPersonsByNameRequestService;
import ir.itsurena.base.sima.request.GetRedemptionInterestRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetRedemptionInterestRequestServiceImpl implements GetRedemptionInterestRequestService {

    @Autowired
    private SimaObjectFactory simaObjectFactory;

    @Override
    public GetRedemptionInterestRequestType createType() {
        return simaObjectFactory.createGetRedemptionInterestRequestType();
    }

    @Override
    public JAXBElement<GetRedemptionInterestRequestType> createElement(GetRedemptionInterestRequestType value) {
        return simaObjectFactory.createGetRedemptionInterestRequest(value);
    }
}

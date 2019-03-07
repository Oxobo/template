package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.GetRedemptionInterestRequestType;
import ir.itsurena.base.dto.request.GetResaleInterestRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.GetRedemptionInterestRequestService;
import ir.itsurena.base.sima.request.GetResaleInterestRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetResaleInterestRequestServiceImpl implements GetResaleInterestRequestService {

    @Autowired
    private SimaObjectFactory simaObjectFactory;

    @Override
    public GetResaleInterestRequestType createType() {
        return simaObjectFactory.createGetResaleInterestRequestType();
    }

    @Override
    public JAXBElement<GetResaleInterestRequestType> createElement(GetResaleInterestRequestType value) {
        return simaObjectFactory.createGetResaleInterestRequest(value);
    }
}

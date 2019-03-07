package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.GetResaleInterestRequestType;
import ir.itsurena.base.dto.request.GetSalesInterestRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.GetResaleInterestRequestService;
import ir.itsurena.base.sima.request.GetSalesInterestRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSalesInterestRequestServiceImpl implements GetSalesInterestRequestService {

    @Autowired
    private SimaObjectFactory simaObjectFactory;

    @Override
    public GetSalesInterestRequestType createType() {
        return simaObjectFactory.createGetSalesInterestRequestType();
    }

    @Override
    public JAXBElement<GetSalesInterestRequestType> createElement(GetSalesInterestRequestType value) {
        return simaObjectFactory.createGetSalesInterestRequest(value);
    }
}

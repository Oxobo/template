package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.CreatePersonRequestType;
import ir.itsurena.base.dto.request.GetAccountsRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.CreatePersonRequestService;
import ir.itsurena.base.sima.request.GetAccountsRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetAccountsRequestServiceImpl implements GetAccountsRequestService {

    @Autowired
    private SimaObjectFactory simaObjectFactory;

    @Override
    public GetAccountsRequestType createType() {
        return simaObjectFactory.createGetAccountsRequestType();
    }

    @Override
    public JAXBElement<GetAccountsRequestType> createElement(GetAccountsRequestType value) {
        return simaObjectFactory.createGetAccountsRequest(value);
    }
}

package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.GetAccountsRequestType;
import ir.itsurena.base.dto.request.GetAllocatedSecuritiesCodesRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.GetAccountsRequestService;
import ir.itsurena.base.sima.request.GetAllocatedSecuritiesCodesRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetAllocatedSecuritiesCodesRequestServiceImpl implements GetAllocatedSecuritiesCodesRequestService {

    @Autowired
    private SimaObjectFactory simaObjectFactory;

    @Override
    public GetAllocatedSecuritiesCodesRequestType createType() {
        return simaObjectFactory.createGetAllocatedSecuritiesCodesRequestType();
    }

    @Override
    public JAXBElement<GetAllocatedSecuritiesCodesRequestType> createElement(GetAllocatedSecuritiesCodesRequestType value) {
        return simaObjectFactory.createGetAllocatedSecuritiesCodesRequest(value);
    }
}

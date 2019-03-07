package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.GetAllocatedSecuritiesCodesRequestType;
import ir.itsurena.base.dto.request.GetAllocatedSecuritiesRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.GetAllocatedSecuritiesCodesRequestService;
import ir.itsurena.base.sima.request.GetAllocatedSecuritiesRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetAllocatedSecuritiesRequestServiceImpl implements GetAllocatedSecuritiesRequestService {

    @Autowired
    private SimaObjectFactory simaObjectFactory;

    @Override
    public GetAllocatedSecuritiesRequestType createType() {
        return simaObjectFactory.createGetAllocatedSecuritiesRequestType();
    }

    @Override
    public JAXBElement<GetAllocatedSecuritiesRequestType> createElement(GetAllocatedSecuritiesRequestType value) {
        return simaObjectFactory.createGetAllocatedSecuritiesRequest(value);
    }
}

package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.GetAllocatedSecuritiesResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.GetAllocatedSecuritiesResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetAllocatedSecuritiesResponseServiceImpl implements GetAllocatedSecuritiesResponseService {

    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public GetAllocatedSecuritiesResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<GetAllocatedSecuritiesResponseType> 
                createElement(GetAllocatedSecuritiesResponseType value) {
        return simaObjectFactory.createGetAllocatedSecuritiesResponse(value);
    }

    @Override
    public GetAllocatedSecuritiesResponseType createType() {
        return simaObjectFactory.createGetAllocatedSecuritiesResponseType();
    }
}

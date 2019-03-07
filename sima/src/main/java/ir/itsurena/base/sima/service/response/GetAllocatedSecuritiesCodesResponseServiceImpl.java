package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.GetAllocatedSecuritiesCodesResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.GetAllocatedSecuritiesCodesResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetAllocatedSecuritiesCodesResponseServiceImpl implements GetAllocatedSecuritiesCodesResponseService {

    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public GetAllocatedSecuritiesCodesResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<GetAllocatedSecuritiesCodesResponseType> 
                createElement(GetAllocatedSecuritiesCodesResponseType value) {
        return simaObjectFactory.createGetAllocatedSecuritiesCodesResponse(value);
    }

    @Override
    public GetAllocatedSecuritiesCodesResponseType createType() {
        return simaObjectFactory.createGetAllocatedSecuritiesCodesResponseType();
    }
}

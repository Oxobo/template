package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.ApproveResaleSecuritiesResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.ApproveResaleSecuritiesResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class ApproveResaleSecuritiesResponseServiceImpl implements ApproveResaleSecuritiesResponseService {
    
    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public ApproveResaleSecuritiesResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<ApproveResaleSecuritiesResponseType> 
                createElement(ApproveResaleSecuritiesResponseType value) {
        return simaObjectFactory.createApproveResaleSecuritiesResponse(value);
    }

    @Override
    public ApproveResaleSecuritiesResponseType createType() {
        return simaObjectFactory.createApproveResaleSecuritiesResponseType();
    }
}

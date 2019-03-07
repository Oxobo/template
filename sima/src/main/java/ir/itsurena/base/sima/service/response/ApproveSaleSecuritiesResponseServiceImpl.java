package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.ApproveSaleSecuritiesResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.ApproveSaleSecuritiesResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class ApproveSaleSecuritiesResponseServiceImpl implements ApproveSaleSecuritiesResponseService {
    
    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public ApproveSaleSecuritiesResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<ApproveSaleSecuritiesResponseType> 
                createElement(ApproveSaleSecuritiesResponseType value) {
        return simaObjectFactory.createApproveSaleSecuritiesResponse(value);
    }

    @Override
    public ApproveSaleSecuritiesResponseType createType() {
        return simaObjectFactory.createApproveSaleSecuritiesResponseType();
    }
}

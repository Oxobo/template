package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.CancelResaleSecuritiesResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.CancelResaleSecuritiesResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class CancelResaleSecuritiesResponseServiceImpl implements CancelResaleSecuritiesResponseService {
    
    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public CancelResaleSecuritiesResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<CancelResaleSecuritiesResponseType> 
                createElement(CancelResaleSecuritiesResponseType value) {
        return simaObjectFactory.createCancelResaleSecuritiesResponse(value);
    }

    @Override
    public CancelResaleSecuritiesResponseType createType() {
        return simaObjectFactory.createCancelResaleSecuritiesResponseType();
    }
}

package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.CancelTransferSecuritiesResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.CancelTransferSecuritiesResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class CancelTransferSecuritiesResponseServiceImpl implements CancelTransferSecuritiesResponseService {
    
    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public CancelTransferSecuritiesResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<CancelTransferSecuritiesResponseType> 
                createElement(CancelTransferSecuritiesResponseType value) {
        return simaObjectFactory.createCancelTransferSecuritiesResponse(value);
    }

    @Override
    public CancelTransferSecuritiesResponseType createType() {
        return simaObjectFactory.createCancelTransferSecuritiesResponseType();
    }
}

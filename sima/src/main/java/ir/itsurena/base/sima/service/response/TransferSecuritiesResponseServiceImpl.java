package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.TransferSecuritiesResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.TransferSecuritiesResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class TransferSecuritiesResponseServiceImpl
                    implements TransferSecuritiesResponseService {

    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public TransferSecuritiesResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<TransferSecuritiesResponseType> 
                createElement(TransferSecuritiesResponseType value) {
        return simaObjectFactory.createTransferSecuritiesResponse(value);
    }

    @Override
    public TransferSecuritiesResponseType createType() {
        return simaObjectFactory.createTransferSecuritiesResponseType();
    }
}

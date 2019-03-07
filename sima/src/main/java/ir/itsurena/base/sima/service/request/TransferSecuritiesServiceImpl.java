package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.TransferSecuritiesRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.TransferSecuritiesRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class TransferSecuritiesServiceImpl implements TransferSecuritiesRequestService {


    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public TransferSecuritiesServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }

    @Override
    public TransferSecuritiesRequestType createType() {
        return simaObjectFactory.createTransferSecuritiesRequestType();
    }

    @Override
    public JAXBElement<TransferSecuritiesRequestType> createElement(TransferSecuritiesRequestType value) {
        return simaObjectFactory.createTransferSecuritiesRequest(value);
    }
}

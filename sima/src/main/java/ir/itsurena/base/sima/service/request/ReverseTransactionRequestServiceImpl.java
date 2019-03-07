package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.ResaleSecuritiesRequestType;
import ir.itsurena.base.dto.request.ReverseTransactionRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.ResaleSecuritiesRequestService;
import ir.itsurena.base.sima.request.ReverseTransactionRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class ReverseTransactionRequestServiceImpl implements ReverseTransactionRequestService {

    @Autowired
    private SimaObjectFactory simaObjectFactory;


    @Override
    public ReverseTransactionRequestType createType() {
        return simaObjectFactory.createReverseTransactionRequestType();
    }

    @Override
    public JAXBElement<ReverseTransactionRequestType> createElement(ReverseTransactionRequestType value) {
        return simaObjectFactory.createReverseTransactionRequest(value);
    }
}

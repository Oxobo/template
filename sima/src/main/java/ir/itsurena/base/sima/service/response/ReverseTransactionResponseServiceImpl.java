package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.ReverseTransactionResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.ReverseTransactionResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class ReverseTransactionResponseServiceImpl
                    implements ReverseTransactionResponseService {

    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public ReverseTransactionResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<ReverseTransactionResponseType> 
                createElement(ReverseTransactionResponseType value) {
        return simaObjectFactory.createReverseTransactionResponse(value);
    }

    @Override
    public ReverseTransactionResponseType createType() {
        return simaObjectFactory.createReverseTransactionResponseType();
    }
}

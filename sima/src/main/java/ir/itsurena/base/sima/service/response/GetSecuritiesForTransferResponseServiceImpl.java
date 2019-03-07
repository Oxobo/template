package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.GetSecuritiesForTransferResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.GetSecuritiesForTransferResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSecuritiesForTransferResponseServiceImpl
                    implements GetSecuritiesForTransferResponseService {

    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public GetSecuritiesForTransferResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<GetSecuritiesForTransferResponseType> 
                createElement(GetSecuritiesForTransferResponseType value) {
        return simaObjectFactory.createGetSecuritiesForTransferResponse(value);
    }

    @Override
    public GetSecuritiesForTransferResponseType createType() {
        return simaObjectFactory.createGetSecuritiesForTransferResponseType();
    }
}

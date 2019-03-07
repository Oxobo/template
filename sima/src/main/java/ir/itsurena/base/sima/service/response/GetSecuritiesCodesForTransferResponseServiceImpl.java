package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.GetSecuritiesCodesForTransferResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.GetSecuritiesCodesForTransferResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSecuritiesCodesForTransferResponseServiceImpl
                    implements GetSecuritiesCodesForTransferResponseService {

    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public GetSecuritiesCodesForTransferResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<GetSecuritiesCodesForTransferResponseType> 
                createElement(GetSecuritiesCodesForTransferResponseType value) {
        return simaObjectFactory.createGetSecuritiesCodesForTransferResponse(value);
    }

    @Override
    public GetSecuritiesCodesForTransferResponseType createType() {
        return simaObjectFactory.createGetSecuritiesCodesForTransferResponseType();
    }
}

package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.GetSecuritiesCodesForResaleResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.GetSecuritiesCodesForResaleResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSecuritiesCodesForResaleResponseServiceImpl
                    implements GetSecuritiesCodesForResaleResponseService {

    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public GetSecuritiesCodesForResaleResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<GetSecuritiesCodesForResaleResponseType> 
                createElement(GetSecuritiesCodesForResaleResponseType value) {
        return simaObjectFactory.createGetSecuritiesCodesForResaleResponse(value);
    }

    @Override
    public GetSecuritiesCodesForResaleResponseType createType() {
        return simaObjectFactory.createGetSecuritiesCodesForResaleResponseType();
    }
}

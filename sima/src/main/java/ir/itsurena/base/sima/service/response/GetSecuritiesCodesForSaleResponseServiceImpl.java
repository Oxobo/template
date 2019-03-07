package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.GetSecuritiesCodesForSaleResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.GetSecuritiesCodesForSaleResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSecuritiesCodesForSaleResponseServiceImpl
                    implements GetSecuritiesCodesForSaleResponseService {

    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public GetSecuritiesCodesForSaleResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<GetSecuritiesCodesForSaleResponseType> 
                createElement(GetSecuritiesCodesForSaleResponseType value) {
        return simaObjectFactory.createGetSecuritiesCodesForSaleResponse(value);
    }

    @Override
    public GetSecuritiesCodesForSaleResponseType createType() {
        return simaObjectFactory.createGetSecuritiesCodesForSaleResponseType();
    }
}

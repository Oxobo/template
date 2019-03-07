package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.GetSecuritiesCouponsDateResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.GetSecuritiesCouponsDateResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSecuritiesCouponsDateResponseServiceImpl
                    implements GetSecuritiesCouponsDateResponseService {

    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public GetSecuritiesCouponsDateResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<GetSecuritiesCouponsDateResponseType> 
                createElement(GetSecuritiesCouponsDateResponseType value) {
        return simaObjectFactory.createGetSecuritiesCouponsDateResponse(value);
    }

    @Override
    public GetSecuritiesCouponsDateResponseType createType() {
        return simaObjectFactory.createGetSecuritiesCouponsDateResponseType();
    }
}

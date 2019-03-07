package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.GetSecuritiesForResaleRequestType;
import ir.itsurena.base.dto.request.GetSecuritiesForSaleRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.GetSecuritiesForResaleRequestService;
import ir.itsurena.base.sima.request.GetSecuritiesForSaleRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSecuritiesForSaleRequestServiceImpl implements GetSecuritiesForSaleRequestService {

    @Autowired
    private SimaObjectFactory simaObjectFactory;

    @Override
    public GetSecuritiesForSaleRequestType createType() {
        return simaObjectFactory.createGetSecuritiesForSaleRequestType();
    }

    @Override
    public JAXBElement<GetSecuritiesForSaleRequestType> createElement(GetSecuritiesForSaleRequestType value) {
        return simaObjectFactory.createGetSecuritiesForSaleRequest(value);
    }
}

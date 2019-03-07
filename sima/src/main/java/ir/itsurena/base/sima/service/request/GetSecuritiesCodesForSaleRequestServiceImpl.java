package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.GetSecuritiesCodesForResaleRequestType;
import ir.itsurena.base.dto.request.GetSecuritiesCodesForSaleRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.GetSecuritiesCodesForResaleRequestService;
import ir.itsurena.base.sima.request.GetSecuritiesCodesForSaleRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSecuritiesCodesForSaleRequestServiceImpl implements GetSecuritiesCodesForSaleRequestService {

    @Autowired
    private SimaObjectFactory simaObjectFactory;

    @Override
    public GetSecuritiesCodesForSaleRequestType createType() {
        return simaObjectFactory.createGetSecuritiesCodesForSaleRequestType();
    }

    @Override
    public JAXBElement<GetSecuritiesCodesForSaleRequestType> createElement(GetSecuritiesCodesForSaleRequestType value) {
        return simaObjectFactory.createGetSecuritiesCodesForSaleRequest(value);
    }
}

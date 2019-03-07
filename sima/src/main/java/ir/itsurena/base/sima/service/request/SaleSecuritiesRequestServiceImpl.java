package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.ReverseTransactionRequestType;
import ir.itsurena.base.dto.request.SaleSecuritiesRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.ReverseTransactionRequestService;
import ir.itsurena.base.sima.request.SaleSecuritiesRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class SaleSecuritiesRequestServiceImpl implements SaleSecuritiesRequestService {

    @Autowired
    private SimaObjectFactory simaObjectFactory;


    @Override
    public SaleSecuritiesRequestType createType() {
        return simaObjectFactory.createSaleSecuritiesRequestType();
    }

    @Override
    public JAXBElement<SaleSecuritiesRequestType> createElement(SaleSecuritiesRequestType value) {
        return simaObjectFactory.createSaleSecuritiesRequest(value);
    }
}

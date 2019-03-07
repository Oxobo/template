package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.CancelResaleSecuritiesRequestType;
import ir.itsurena.base.dto.request.CancelSaleSecuritiesRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.CancelSaleSecuritiesRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class CancelSaleSecuritiesRequestServiceImpl implements CancelSaleSecuritiesRequestService {

    @Autowired
    private SimaObjectFactory simaObjectFactory;

    @Override
    public CancelSaleSecuritiesRequestType createType() {
        return simaObjectFactory.createCancelSaleSecuritiesRequestType();
    }

    @Override
    public JAXBElement<CancelSaleSecuritiesRequestType> createElement(CancelSaleSecuritiesRequestType value) {
        return simaObjectFactory.createCancelSaleSecuritiesRequest(value);
    }
}

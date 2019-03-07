package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.CancelRedemptionSecuritiesRequestType;
import ir.itsurena.base.dto.request.CancelResaleSecuritiesRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.CancelRedemptionSecuritiesRequestService;
import ir.itsurena.base.sima.request.CancelResaleSecuritiesRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class CancelRedemptionSecuritiesRequestServiceImpl implements CancelRedemptionSecuritiesRequestService {

    @Autowired
    private SimaObjectFactory simaObjectFactory;

    @Override
    public CancelRedemptionSecuritiesRequestType createType() {
        return simaObjectFactory.createCancelRedemptionSecuritiesRequestType();
    }

    @Override
    public JAXBElement<CancelRedemptionSecuritiesRequestType> createElement(CancelRedemptionSecuritiesRequestType value) {
        return simaObjectFactory.createCancelRedemptionSecuritiesRequest(value);
    }
}

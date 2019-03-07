package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.RedemptionSecuritiesRequestType;
import ir.itsurena.base.dto.request.ResaleSecuritiesRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.RedemptionSecuritiesRequestService;
import ir.itsurena.base.sima.request.ResaleSecuritiesRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class ResaleSecuritiesRequestServiceImpl implements ResaleSecuritiesRequestService {

    @Autowired
    private SimaObjectFactory simaObjectFactory;


    @Override
    public ResaleSecuritiesRequestType createType() {
        return simaObjectFactory.createResaleSecuritiesRequestType();
    }

    @Override
    public JAXBElement<ResaleSecuritiesRequestType> createElement(ResaleSecuritiesRequestType value) {
        return simaObjectFactory.createResaleSecuritiesRequest(value);
    }
}

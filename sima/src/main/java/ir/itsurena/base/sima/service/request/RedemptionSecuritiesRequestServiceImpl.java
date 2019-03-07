package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.PingRequestType;
import ir.itsurena.base.dto.request.RedemptionSecuritiesRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.PingRequestService;
import ir.itsurena.base.sima.request.RedemptionSecuritiesRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class RedemptionSecuritiesRequestServiceImpl implements RedemptionSecuritiesRequestService {

    @Autowired
    private SimaObjectFactory simaObjectFactory;


    @Override
    public RedemptionSecuritiesRequestType createType() {
        return simaObjectFactory.createRedemptionSecuritiesRequestType();
    }

    @Override
    public JAXBElement<RedemptionSecuritiesRequestType> createElement(RedemptionSecuritiesRequestType value) {
        return simaObjectFactory.createRedemptionSecuritiesRequest(value);
    }
}

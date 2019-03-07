package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.GetSecuritiesForRedemptionRequestType;
import ir.itsurena.base.dto.request.GetSecuritiesForResaleRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.GetSecuritiesForRedemptionRequestService;
import ir.itsurena.base.sima.request.GetSecuritiesForResaleRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSecuritiesForResaleRequestServiceImpl implements GetSecuritiesForResaleRequestService {

    @Autowired
    private SimaObjectFactory simaObjectFactory;

    @Override
    public GetSecuritiesForResaleRequestType createType() {
        return simaObjectFactory.createGetSecuritiesForResaleRequestType();
    }

    @Override
    public JAXBElement<GetSecuritiesForResaleRequestType> createElement(GetSecuritiesForResaleRequestType value) {
        return simaObjectFactory.createGetSecuritiesForResaleRequest(value);
    }
}

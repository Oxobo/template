package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.GetSecuritiesCouponsDateRequestType;
import ir.itsurena.base.dto.request.GetSecuritiesForRedemptionRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.GetSecuritiesCouponsDateRequestService;
import ir.itsurena.base.sima.request.GetSecuritiesForRedemptionRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSecuritiesForRedemptionRequestServiceImpl implements GetSecuritiesForRedemptionRequestService {

    @Autowired
    private SimaObjectFactory simaObjectFactory;

    @Override
    public GetSecuritiesForRedemptionRequestType createType() {
        return simaObjectFactory.createGetSecuritiesForRedemptionRequestType();
    }

    @Override
    public JAXBElement<GetSecuritiesForRedemptionRequestType> createElement(GetSecuritiesForRedemptionRequestType value) {
        return simaObjectFactory.createGetSecuritiesForRedemptionRequest(value);
    }
}

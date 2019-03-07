package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.GetSalesInterestRequestType;
import ir.itsurena.base.dto.request.GetSecuritiesCodesForRedemptionRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.GetSalesInterestRequestService;
import ir.itsurena.base.sima.request.GetSecuritiesCodesForRedemptionRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSecuritiesCodesForRedemptionRequestServiceImpl implements GetSecuritiesCodesForRedemptionRequestService {

    @Autowired
    private SimaObjectFactory simaObjectFactory;

    @Override
    public GetSecuritiesCodesForRedemptionRequestType createType() {
        return simaObjectFactory.createGetSecuritiesCodesForRedemptionRequestType();
    }

    @Override
    public JAXBElement<GetSecuritiesCodesForRedemptionRequestType> createElement(GetSecuritiesCodesForRedemptionRequestType value) {
        return simaObjectFactory.createGetSecuritiesCodesForRedemptionRequest(value);
    }
}

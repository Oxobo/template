package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.GetSecuritiesCodesForRedemptionRequestType;
import ir.itsurena.base.dto.request.GetSecuritiesCodesForResaleRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.GetSecuritiesCodesForRedemptionRequestService;
import ir.itsurena.base.sima.request.GetSecuritiesCodesForResaleRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSecuritiesCodesForResaleRequestServiceImpl implements GetSecuritiesCodesForResaleRequestService {

    @Autowired
    private SimaObjectFactory simaObjectFactory;

    @Override
    public GetSecuritiesCodesForResaleRequestType createType() {
        return simaObjectFactory.createGetSecuritiesCodesForResaleRequestType();
    }

    @Override
    public JAXBElement<GetSecuritiesCodesForResaleRequestType> createElement(GetSecuritiesCodesForResaleRequestType value) {
        return simaObjectFactory.createGetSecuritiesCodesForResaleRequest(value);
    }
}

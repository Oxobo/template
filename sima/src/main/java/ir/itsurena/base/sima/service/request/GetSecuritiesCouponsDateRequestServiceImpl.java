package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.GetSecuritiesCodesForTransferRequestType;
import ir.itsurena.base.dto.request.GetSecuritiesCouponsDateRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.GetSecuritiesCodesForTransferRequestService;
import ir.itsurena.base.sima.request.GetSecuritiesCouponsDateRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSecuritiesCouponsDateRequestServiceImpl implements GetSecuritiesCouponsDateRequestService {

    @Autowired
    private SimaObjectFactory simaObjectFactory;

    @Override
    public GetSecuritiesCouponsDateRequestType createType() {
        return simaObjectFactory.createGetSecuritiesCouponsDateRequestType();
    }

    @Override
    public JAXBElement<GetSecuritiesCouponsDateRequestType> createElement(GetSecuritiesCouponsDateRequestType value) {
        return simaObjectFactory.createGetSecuritiesCouponsDateRequest(value);
    }
}

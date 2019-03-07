package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.GetSecuritiesForTransferRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.GetSecuritiesForTransferRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSecuritiesForTransferRequestServiceImpl implements GetSecuritiesForTransferRequestService {

    @Autowired
    private SimaObjectFactory simaObjectFactory;

    @Override
    public GetSecuritiesForTransferRequestType createType() {
        return simaObjectFactory.createGetSecuritiesForTransferRequestType();
    }

    @Override
    public JAXBElement<GetSecuritiesForTransferRequestType> createElement(GetSecuritiesForTransferRequestType value) {
        return simaObjectFactory.createGetSecuritiesForTransferRequest(value);
    }
}

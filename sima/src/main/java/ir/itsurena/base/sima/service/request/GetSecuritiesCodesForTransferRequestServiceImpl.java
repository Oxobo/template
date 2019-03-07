package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.GetSecuritiesCodesForSaleRequestType;
import ir.itsurena.base.dto.request.GetSecuritiesCodesForTransferRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.GetSecuritiesCodesForSaleRequestService;
import ir.itsurena.base.sima.request.GetSecuritiesCodesForTransferRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSecuritiesCodesForTransferRequestServiceImpl implements GetSecuritiesCodesForTransferRequestService {

    @Autowired
    private SimaObjectFactory simaObjectFactory;

    @Override
    public GetSecuritiesCodesForTransferRequestType createType() {
        return simaObjectFactory.createGetSecuritiesCodesForTransferRequestType();
    }

    @Override
    public JAXBElement<GetSecuritiesCodesForTransferRequestType> createElement(GetSecuritiesCodesForTransferRequestType value) {
        return simaObjectFactory.createGetSecuritiesCodesForTransferRequest(value);
    }
}

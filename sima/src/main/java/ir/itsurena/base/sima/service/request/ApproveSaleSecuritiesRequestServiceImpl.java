package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.ApproveSaleSecuritiesRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.ApproveSaleSecuritiesRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class ApproveSaleSecuritiesRequestServiceImpl implements ApproveSaleSecuritiesRequestService {
    @Autowired
    private SimaObjectFactory simaObjectFactory;

    @Override
    public ApproveSaleSecuritiesRequestType createType() {
        return simaObjectFactory.createApproveSaleSecuritiesRequestType();
    }

    @Override
    public JAXBElement<ApproveSaleSecuritiesRequestType> createElement(ApproveSaleSecuritiesRequestType value) {
        return simaObjectFactory.createApproveSaleSecuritiesRequest(value);
    }
}

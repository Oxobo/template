package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.AbstractRequestType;
import ir.itsurena.base.dto.request.ApproveResaleSecuritiesRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.ApproveResaleSecuritiesRequestService;
import ir.itsurena.base.sima.request.SimaRequestServiceCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class ApproveResaleSecuritiesRequestServiceImpl implements ApproveResaleSecuritiesRequestService {

    @Autowired
    private SimaObjectFactory simaObjectFactory;

    @Override
    public ApproveResaleSecuritiesRequestType createType() {
        return simaObjectFactory.createApproveResaleSecuritiesRequestType();
    }

    @Override
    public JAXBElement<ApproveResaleSecuritiesRequestType> createElement(ApproveResaleSecuritiesRequestType value) {
        return simaObjectFactory.createApproveResaleSecuritiesRequest(value);
    }
}

package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.ApproveTransferSecuritiesRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.ApproveTransferSecuritiesRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class ApproveTransferSecuritiesRequestServiceImpl implements ApproveTransferSecuritiesRequestService {

    @Autowired
    private SimaObjectFactory simaObjectFactory;

    @Override
    public ApproveTransferSecuritiesRequestType createType() {
        return simaObjectFactory.createApproveTransferSecuritiesRequestType();
    }

    @Override
    public JAXBElement<ApproveTransferSecuritiesRequestType> createElement(ApproveTransferSecuritiesRequestType value) {
        return simaObjectFactory.createApproveTransferSecuritiesRequest(value);
    }
}

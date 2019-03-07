package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.CancelTransferSecuritiesRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.CancelTransferSecuritiesRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class CancelTransferSecuritiesRequestServiceImpl implements CancelTransferSecuritiesRequestService {

    @Autowired
    private SimaObjectFactory simaObjectFactory;

    @Override
    public CancelTransferSecuritiesRequestType createType() {
        return simaObjectFactory.createCancelTransferSecuritiesRequestType();
    }

    @Override
    public JAXBElement<CancelTransferSecuritiesRequestType> createElement(CancelTransferSecuritiesRequestType value) {
        return simaObjectFactory.createCancelTransferSecuritiesRequest(value);
    }
}

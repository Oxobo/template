package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.BlockPartyRequestType;
import ir.itsurena.base.dto.request.CancelResaleSecuritiesRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.BlockPartyRequestService;
import ir.itsurena.base.sima.request.CancelResaleSecuritiesRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class CancelResaleSecuritiesRequestServiceImpl implements CancelResaleSecuritiesRequestService {

    @Autowired
    private SimaObjectFactory simaObjectFactory;

    @Override
    public CancelResaleSecuritiesRequestType createType() {
        return simaObjectFactory.createCancelResaleSecuritiesRequestType();
    }

    @Override
    public JAXBElement<CancelResaleSecuritiesRequestType> createElement(CancelResaleSecuritiesRequestType value) {
        return simaObjectFactory.createCancelResaleSecuritiesRequest(value);
    }
}

package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.GetSecuritiesForTransferRequestType;
import ir.itsurena.base.dto.request.PartialBlockAccountRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.GetSecuritiesForTransferRequestService;
import ir.itsurena.base.sima.request.PartialBlockAccountRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class PartialBlockAccountRequestServiceImpl implements PartialBlockAccountRequestService {

    @Autowired
    private SimaObjectFactory simaObjectFactory;

    @Override
    public PartialBlockAccountRequestType createType() {
        return simaObjectFactory.createPartialBlockAccountRequestType();
    }

    @Override
    public JAXBElement<PartialBlockAccountRequestType> createElement(PartialBlockAccountRequestType value) {
        return simaObjectFactory.createPartialBlockAccountRequest(value);
    }
}

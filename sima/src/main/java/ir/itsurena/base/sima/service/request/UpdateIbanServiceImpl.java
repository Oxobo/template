package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.UpdateIbanRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.UpdateIbanRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class UpdateIbanServiceImpl implements UpdateIbanRequestService {


    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public UpdateIbanServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }

    @Override
    public UpdateIbanRequestType createType() {
        return simaObjectFactory.createUpdateIbanRequestType();
    }

    @Override
    public JAXBElement<UpdateIbanRequestType> createElement(UpdateIbanRequestType value) {
        return simaObjectFactory.createUpdateIbanRequest(value);
    }
}

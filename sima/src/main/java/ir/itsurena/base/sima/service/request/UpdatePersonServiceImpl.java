package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.UpdatePersonRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.UpdatePersonRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class UpdatePersonServiceImpl implements UpdatePersonRequestService {


    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public UpdatePersonServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }

    @Override
    public UpdatePersonRequestType createType() {
        return simaObjectFactory.createUpdatePersonRequestType();
    }

    @Override
    public JAXBElement<UpdatePersonRequestType> createElement(UpdatePersonRequestType value) {
        return simaObjectFactory.createUpdatePersonRequest(value);
    }
}

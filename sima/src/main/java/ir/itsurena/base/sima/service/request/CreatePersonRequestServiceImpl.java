package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.CreateOrganizationRequestType;
import ir.itsurena.base.dto.request.CreatePersonRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.CreateOrganizationRequestService;
import ir.itsurena.base.sima.request.CreatePersonRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class CreatePersonRequestServiceImpl implements CreatePersonRequestService {

    @Autowired
    private SimaObjectFactory simaObjectFactory;

    @Override
    public CreatePersonRequestType createType() {
        return simaObjectFactory.createCreatePersonRequestType();
    }

    @Override
    public JAXBElement<CreatePersonRequestType> createElement(CreatePersonRequestType value) {
        return simaObjectFactory.createCreatePersonRequest(value);
    }
}

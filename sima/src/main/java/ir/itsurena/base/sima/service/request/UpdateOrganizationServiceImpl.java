package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.UpdateOrganizationRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.UpdateOrganizationRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class UpdateOrganizationServiceImpl implements UpdateOrganizationRequestService {


    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public UpdateOrganizationServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }

    @Override
    public UpdateOrganizationRequestType createType() {
        return simaObjectFactory.createUpdateOrganizationRequestType();
    }

    @Override
    public JAXBElement<UpdateOrganizationRequestType> createElement(UpdateOrganizationRequestType value) {
        return simaObjectFactory.createUpdateOrganizationRequest(value);
    }
}

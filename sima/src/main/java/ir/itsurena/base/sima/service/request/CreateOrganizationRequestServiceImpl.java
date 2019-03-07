package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.CancelTransferSecuritiesRequestType;
import ir.itsurena.base.dto.request.CreateOrganizationRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.CreateOrganizationRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class CreateOrganizationRequestServiceImpl implements CreateOrganizationRequestService {

    @Autowired
    private SimaObjectFactory simaObjectFactory;

    @Override
    public CreateOrganizationRequestType createType() {
        return simaObjectFactory.createCreateOrganizationRequestType();
    }

    @Override
    public JAXBElement<CreateOrganizationRequestType> createElement(CreateOrganizationRequestType value) {
        return simaObjectFactory.createCreateOrganizationRequest(value);
    }
}

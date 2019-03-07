package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.CreateOrganizationResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.CreateOrganizationResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class CreateOrganizationResponseServiceImpl implements CreateOrganizationResponseService {
    
    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public CreateOrganizationResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<CreateOrganizationResponseType> 
                createElement(CreateOrganizationResponseType value) {
        return simaObjectFactory.createCreateOrganizationResponse(value);
    }

    @Override
    public CreateOrganizationResponseType createType() {
        return simaObjectFactory.createCreateOrganizationResponseType();
    }
}

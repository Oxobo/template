package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.UpdateOrganizationResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.UpdateOrganizationResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class UpdateOrganizationResponseServiceImpl
                    implements UpdateOrganizationResponseService {

    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public UpdateOrganizationResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<UpdateOrganizationResponseType> 
                createElement(UpdateOrganizationResponseType value) {
        return simaObjectFactory.createUpdateOrganizationResponse(value);
    }

    @Override
    public UpdateOrganizationResponseType createType() {
        return simaObjectFactory.createUpdateOrganizationResponseType();
    }
}

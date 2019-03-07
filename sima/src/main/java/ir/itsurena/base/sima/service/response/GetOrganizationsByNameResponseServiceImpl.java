package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.GetOrganizationsByNameResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.GetOrganizationsByNameResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetOrganizationsByNameResponseServiceImpl implements GetOrganizationsByNameResponseService {

    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public GetOrganizationsByNameResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<GetOrganizationsByNameResponseType> 
                createElement(GetOrganizationsByNameResponseType value) {
        return simaObjectFactory.createGetOrganizationsByNameResponse(value);
    }

    @Override
    public GetOrganizationsByNameResponseType createType() {
        return simaObjectFactory.createGetOrganizationsByNameResponseType();
    }
}

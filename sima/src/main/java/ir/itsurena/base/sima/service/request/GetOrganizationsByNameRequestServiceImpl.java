package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.GetOrganizationByIdentifierRequestType;
import ir.itsurena.base.dto.request.GetOrganizationsByNameRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.GetOrganizationByIdentifierRequestService;
import ir.itsurena.base.sima.request.GetOrganizationsByNameRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetOrganizationsByNameRequestServiceImpl implements GetOrganizationsByNameRequestService {

    @Autowired
    private SimaObjectFactory simaObjectFactory;

    @Override
    public GetOrganizationsByNameRequestType createType() {
        return simaObjectFactory.createGetOrganizationsByNameRequestType();
    }

    @Override
    public JAXBElement<GetOrganizationsByNameRequestType> createElement(GetOrganizationsByNameRequestType value) {
        return simaObjectFactory.createGetOrganizationsByNameRequest(value);
    }
}

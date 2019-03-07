package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.GetAllocatedSecuritiesRequestType;
import ir.itsurena.base.dto.request.GetOrganizationByIdentifierRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.GetAllocatedSecuritiesRequestService;
import ir.itsurena.base.sima.request.GetOrganizationByIdentifierRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetOrganizationByIdentifierRequestServiceImpl implements GetOrganizationByIdentifierRequestService {

    @Autowired
    private SimaObjectFactory simaObjectFactory;

    @Override
    public GetOrganizationByIdentifierRequestType createType() {
        return simaObjectFactory.createGetOrganizationByIdentifierRequestType();
    }

    @Override
    public JAXBElement<GetOrganizationByIdentifierRequestType> createElement(GetOrganizationByIdentifierRequestType value) {
        return simaObjectFactory.createGetOrganizationByIdentifierRequest(value);
    }
}

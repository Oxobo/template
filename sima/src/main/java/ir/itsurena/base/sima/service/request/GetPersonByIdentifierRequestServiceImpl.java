package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.GetOrganizationsByNameRequestType;
import ir.itsurena.base.dto.request.GetPersonByIdentifierRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.GetOrganizationsByNameRequestService;
import ir.itsurena.base.sima.request.GetPersonByIdentifierRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetPersonByIdentifierRequestServiceImpl implements GetPersonByIdentifierRequestService {

    @Autowired
    private SimaObjectFactory simaObjectFactory;

    @Override
    public GetPersonByIdentifierRequestType createType() {
        return simaObjectFactory.createGetPersonByIdentifierRequestType();
    }

    @Override
    public JAXBElement<GetPersonByIdentifierRequestType> createElement(GetPersonByIdentifierRequestType value) {
        return simaObjectFactory.createGetPersonByIdentifierRequest(value);
    }
}

package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.GetPersonByIdentifierRequestType;
import ir.itsurena.base.dto.request.GetPersonsByNameRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.GetPersonByIdentifierRequestService;
import ir.itsurena.base.sima.request.GetPersonsByNameRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetPersonsByNameRequestServiceImpl implements GetPersonsByNameRequestService {

    @Autowired
    private SimaObjectFactory simaObjectFactory;

    @Override
    public GetPersonsByNameRequestType createType() {
        return simaObjectFactory.createGetPersonsByNameRequestType();
    }

    @Override
    public JAXBElement<GetPersonsByNameRequestType> createElement(GetPersonsByNameRequestType value) {
        return simaObjectFactory.createGetPersonsByNameRequest(value);
    }
}

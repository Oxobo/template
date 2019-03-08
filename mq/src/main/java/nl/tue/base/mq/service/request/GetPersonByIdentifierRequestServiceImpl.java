package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.GetPersonByIdentifierRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.GetPersonByIdentifierRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetPersonByIdentifierRequestServiceImpl implements GetPersonByIdentifierRequestService {

    @Autowired
    private MqObjectFactory mqObjectFactory;

    @Override
    public GetPersonByIdentifierRequestType createType() {
        return mqObjectFactory.createGetPersonByIdentifierRequestType();
    }

    @Override
    public JAXBElement<GetPersonByIdentifierRequestType> createElement(GetPersonByIdentifierRequestType value) {
        return mqObjectFactory.createGetPersonByIdentifierRequest(value);
    }
}

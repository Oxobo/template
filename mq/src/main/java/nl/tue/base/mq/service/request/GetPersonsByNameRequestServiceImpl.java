package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.GetPersonsByNameRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.GetPersonsByNameRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetPersonsByNameRequestServiceImpl implements GetPersonsByNameRequestService {

    @Autowired
    private MqObjectFactory mqObjectFactory;

    @Override
    public GetPersonsByNameRequestType createType() {
        return mqObjectFactory.createGetPersonsByNameRequestType();
    }

    @Override
    public JAXBElement<GetPersonsByNameRequestType> createElement(GetPersonsByNameRequestType value) {
        return mqObjectFactory.createGetPersonsByNameRequest(value);
    }
}

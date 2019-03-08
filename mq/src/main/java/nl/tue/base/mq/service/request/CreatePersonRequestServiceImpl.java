package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.CreatePersonRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.CreatePersonRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class CreatePersonRequestServiceImpl implements CreatePersonRequestService {

    @Autowired
    private MqObjectFactory mqObjectFactory;

    @Override
    public CreatePersonRequestType createType() {
        return mqObjectFactory.createCreatePersonRequestType();
    }

    @Override
    public JAXBElement<CreatePersonRequestType> createElement(CreatePersonRequestType value) {
        return mqObjectFactory.createCreatePersonRequest(value);
    }
}

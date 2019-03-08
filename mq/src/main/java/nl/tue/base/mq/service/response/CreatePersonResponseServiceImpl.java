package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.CreatePersonResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.CreatePersonResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class CreatePersonResponseServiceImpl implements CreatePersonResponseService {
    
    private MqObjectFactory mqObjectFactory;

    @Autowired
    public CreatePersonResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<CreatePersonResponseType> 
                createElement(CreatePersonResponseType value) {
        return mqObjectFactory.createCreatePersonResponse(value);
    }

    @Override
    public CreatePersonResponseType createType() {
        return mqObjectFactory.createCreatePersonResponseType();
    }
}

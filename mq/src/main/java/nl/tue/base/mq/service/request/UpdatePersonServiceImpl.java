package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.UpdatePersonRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.UpdatePersonRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class UpdatePersonServiceImpl implements UpdatePersonRequestService {


    private MqObjectFactory mqObjectFactory;

    @Autowired
    public UpdatePersonServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }

    @Override
    public UpdatePersonRequestType createType() {
        return mqObjectFactory.createUpdatePersonRequestType();
    }

    @Override
    public JAXBElement<UpdatePersonRequestType> createElement(UpdatePersonRequestType value) {
        return mqObjectFactory.createUpdatePersonRequest(value);
    }
}

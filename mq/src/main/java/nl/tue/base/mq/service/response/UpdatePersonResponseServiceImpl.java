package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.UpdatePersonResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.UpdatePersonResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class UpdatePersonResponseServiceImpl
                    implements UpdatePersonResponseService {

    private MqObjectFactory mqObjectFactory;

    @Autowired
    public UpdatePersonResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<UpdatePersonResponseType> 
                createElement(UpdatePersonResponseType value) {
        return mqObjectFactory.createUpdatePersonResponse(value);
    }

    @Override
    public UpdatePersonResponseType createType() {
        return mqObjectFactory.createUpdatePersonResponseType();
    }
}

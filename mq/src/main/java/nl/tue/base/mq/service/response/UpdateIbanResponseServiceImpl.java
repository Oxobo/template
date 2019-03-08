package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.UpdateIbanResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.UpdateIbanResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class UpdateIbanResponseServiceImpl
                    implements UpdateIbanResponseService {

    private MqObjectFactory mqObjectFactory;

    @Autowired
    public UpdateIbanResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<UpdateIbanResponseType> 
                createElement(UpdateIbanResponseType value) {
        return mqObjectFactory.createUpdateIbanResponse(value);
    }

    @Override
    public UpdateIbanResponseType createType() {
        return mqObjectFactory.createUpdateIbanResponseType();
    }
}

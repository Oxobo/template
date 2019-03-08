package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.UpdateIbanRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.UpdateIbanRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class UpdateIbanServiceImpl implements UpdateIbanRequestService {


    private MqObjectFactory mqObjectFactory;

    @Autowired
    public UpdateIbanServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }

    @Override
    public UpdateIbanRequestType createType() {
        return mqObjectFactory.createUpdateIbanRequestType();
    }

    @Override
    public JAXBElement<UpdateIbanRequestType> createElement(UpdateIbanRequestType value) {
        return mqObjectFactory.createUpdateIbanRequest(value);
    }
}

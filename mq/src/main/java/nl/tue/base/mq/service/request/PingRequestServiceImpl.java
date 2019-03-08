package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.PingRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.PingRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class PingRequestServiceImpl implements PingRequestService {

    private MqObjectFactory mqObjectFactory;

    @Autowired
    public PingRequestServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }

    @Override
    public PingRequestType createType() {
        return mqObjectFactory.createPingRequestType();
    }

    @Override
    public JAXBElement<PingRequestType> createElement(PingRequestType value) {
        return mqObjectFactory.createPingRequest(value);
    }
}

package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.PingResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.PingResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class PingResponseServiceImpl
                    implements PingResponseService {

    private MqObjectFactory mqObjectFactory;

    @Autowired
    public PingResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<PingResponseType> 
                createElement(PingResponseType value) {
        return mqObjectFactory.createPingResponse(value);
    }

    @Override
    public PingResponseType createType() {
        return mqObjectFactory.createPingResponseType();
    }
}

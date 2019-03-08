package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.PartialBlockAccountRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.PartialBlockAccountRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class PartialBlockAccountRequestServiceImpl implements PartialBlockAccountRequestService {

    @Autowired
    private MqObjectFactory mqObjectFactory;

    @Override
    public PartialBlockAccountRequestType createType() {
        return mqObjectFactory.createPartialBlockAccountRequestType();
    }

    @Override
    public JAXBElement<PartialBlockAccountRequestType> createElement(PartialBlockAccountRequestType value) {
        return mqObjectFactory.createPartialBlockAccountRequest(value);
    }
}

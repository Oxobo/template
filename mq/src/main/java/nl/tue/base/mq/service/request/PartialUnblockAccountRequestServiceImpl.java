package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.PartialUnblockAccountRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.PartialUnblockAccountRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class PartialUnblockAccountRequestServiceImpl implements PartialUnblockAccountRequestService {

    @Autowired
    private MqObjectFactory mqObjectFactory;

    @Override
    public PartialUnblockAccountRequestType createType() {
        return mqObjectFactory.createPartialUnblockAccountRequestType();
    }

    @Override
    public JAXBElement<PartialUnblockAccountRequestType> createElement(PartialUnblockAccountRequestType value) {
        return mqObjectFactory.createPartialUnblockAccountRequest(value);
    }
}

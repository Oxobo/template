package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.UnblockPartyRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.UnblockPartyRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class UnblockPartyServiceImpl implements UnblockPartyRequestService {


    private MqObjectFactory mqObjectFactory;

    @Autowired
    public UnblockPartyServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }

    @Override
    public UnblockPartyRequestType createType() {
        return mqObjectFactory.createUnblockPartyRequestType();
    }

    @Override
    public JAXBElement<UnblockPartyRequestType> createElement(UnblockPartyRequestType value) {
        return mqObjectFactory.createUnblockPartyRequest(value);
    }
}

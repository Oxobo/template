package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.UnblockAccountRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.UnblockAccountRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class UnblockAccountServiceImpl implements UnblockAccountRequestService {


    private MqObjectFactory mqObjectFactory;

    @Autowired
    public UnblockAccountServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }

    @Override
    public UnblockAccountRequestType createType() {
        return mqObjectFactory.createUnblockAccountRequestType();
    }

    @Override
    public JAXBElement<UnblockAccountRequestType> createElement(UnblockAccountRequestType value) {
        return mqObjectFactory.createUnblockAccountRequest(value);
    }
}

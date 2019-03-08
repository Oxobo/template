package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.UnblockPartyResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.UnblockPartyResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class UnblockPartyResponseServiceImpl
                    implements UnblockPartyResponseService {

    private MqObjectFactory mqObjectFactory;

    @Autowired
    public UnblockPartyResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<UnblockPartyResponseType> 
                createElement(UnblockPartyResponseType value) {
        return mqObjectFactory.createUnblockPartyResponse(value);
    }

    @Override
    public UnblockPartyResponseType createType() {
        return mqObjectFactory.createUnblockPartyResponseType();
    }
}

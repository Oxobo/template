package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.PartialUnblockAccountResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.PartialUnblockAccountResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class PartialUnblockAccountResponseServiceImpl
                    implements PartialUnblockAccountResponseService {

    private MqObjectFactory mqObjectFactory;

    @Autowired
    public PartialUnblockAccountResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<PartialUnblockAccountResponseType> 
                createElement(PartialUnblockAccountResponseType value) {
        return mqObjectFactory.createPartialUnblockAccountResponse(value);
    }

    @Override
    public PartialUnblockAccountResponseType createType() {
        return mqObjectFactory.createPartialUnblockAccountResponseType();
    }
}

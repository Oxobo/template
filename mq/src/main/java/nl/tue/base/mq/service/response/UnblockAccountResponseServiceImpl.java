package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.UnblockAccountResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.UnblockAccountResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class UnblockAccountResponseServiceImpl
                    implements UnblockAccountResponseService {

    private MqObjectFactory mqObjectFactory;

    @Autowired
    public UnblockAccountResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<UnblockAccountResponseType> 
                createElement(UnblockAccountResponseType value) {
        return mqObjectFactory.createUnblockAccountResponse(value);
    }

    @Override
    public UnblockAccountResponseType createType() {
        return mqObjectFactory.createUnblockAccountResponseType();
    }
}

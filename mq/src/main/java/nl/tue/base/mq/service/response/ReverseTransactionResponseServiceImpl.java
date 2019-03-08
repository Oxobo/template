package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.ReverseTransactionResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.ReverseTransactionResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class ReverseTransactionResponseServiceImpl
                    implements ReverseTransactionResponseService {

    private MqObjectFactory mqObjectFactory;

    @Autowired
    public ReverseTransactionResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<ReverseTransactionResponseType> 
                createElement(ReverseTransactionResponseType value) {
        return mqObjectFactory.createReverseTransactionResponse(value);
    }

    @Override
    public ReverseTransactionResponseType createType() {
        return mqObjectFactory.createReverseTransactionResponseType();
    }
}

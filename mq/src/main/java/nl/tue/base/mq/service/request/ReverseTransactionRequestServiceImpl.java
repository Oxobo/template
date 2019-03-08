package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.ReverseTransactionRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.ReverseTransactionRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class ReverseTransactionRequestServiceImpl implements ReverseTransactionRequestService {

    @Autowired
    private MqObjectFactory mqObjectFactory;


    @Override
    public ReverseTransactionRequestType createType() {
        return mqObjectFactory.createReverseTransactionRequestType();
    }

    @Override
    public JAXBElement<ReverseTransactionRequestType> createElement(ReverseTransactionRequestType value) {
        return mqObjectFactory.createReverseTransactionRequest(value);
    }
}

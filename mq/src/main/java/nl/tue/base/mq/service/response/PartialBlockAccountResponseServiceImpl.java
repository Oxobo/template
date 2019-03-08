package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.PartialBlockAccountResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.PartialBlockAccountResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class PartialBlockAccountResponseServiceImpl
                    implements PartialBlockAccountResponseService {

    private MqObjectFactory mqObjectFactory;

    @Autowired
    public PartialBlockAccountResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<PartialBlockAccountResponseType> 
                createElement(PartialBlockAccountResponseType value) {
        return mqObjectFactory.createPartialBlockAccountResponse(value);
    }

    @Override
    public PartialBlockAccountResponseType createType() {
        return mqObjectFactory.createPartialBlockAccountResponseType();
    }
}

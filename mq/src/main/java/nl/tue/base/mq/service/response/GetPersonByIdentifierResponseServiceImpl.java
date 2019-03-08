package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.GetPersonByIdentifierResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.GetPersonByIdentifierResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetPersonByIdentifierResponseServiceImpl implements GetPersonByIdentifierResponseService {

    private MqObjectFactory mqObjectFactory;

    @Autowired
    public GetPersonByIdentifierResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<GetPersonByIdentifierResponseType> 
                createElement(GetPersonByIdentifierResponseType value) {
        return mqObjectFactory.createGetPersonByIdentifierResponse(value);
    }

    @Override
    public GetPersonByIdentifierResponseType createType() {
        return mqObjectFactory.createGetPersonByIdentifierResponseType();
    }
}

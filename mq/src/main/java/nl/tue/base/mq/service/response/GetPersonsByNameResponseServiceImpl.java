package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.GetPersonsByNameResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.GetPersonsByNameResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetPersonsByNameResponseServiceImpl implements GetPersonsByNameResponseService {

    private MqObjectFactory mqObjectFactory;

    @Autowired
    public GetPersonsByNameResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<GetPersonsByNameResponseType> 
                createElement(GetPersonsByNameResponseType value) {
        return mqObjectFactory.createGetPersonsByNameResponse(value);
    }

    @Override
    public GetPersonsByNameResponseType createType() {
        return mqObjectFactory.createGetPersonsByNameResponseType();
    }
}

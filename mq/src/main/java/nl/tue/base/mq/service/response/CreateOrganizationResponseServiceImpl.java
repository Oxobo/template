package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.CreateOrganizationResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.CreateOrganizationResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class CreateOrganizationResponseServiceImpl implements CreateOrganizationResponseService {
    
    private MqObjectFactory mqObjectFactory;

    @Autowired
    public CreateOrganizationResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<CreateOrganizationResponseType> 
                createElement(CreateOrganizationResponseType value) {
        return mqObjectFactory.createCreateOrganizationResponse(value);
    }

    @Override
    public CreateOrganizationResponseType createType() {
        return mqObjectFactory.createCreateOrganizationResponseType();
    }
}

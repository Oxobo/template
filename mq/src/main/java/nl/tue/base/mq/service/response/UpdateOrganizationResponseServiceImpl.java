package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.UpdateOrganizationResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.UpdateOrganizationResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class UpdateOrganizationResponseServiceImpl
                    implements UpdateOrganizationResponseService {

    private MqObjectFactory mqObjectFactory;

    @Autowired
    public UpdateOrganizationResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<UpdateOrganizationResponseType> 
                createElement(UpdateOrganizationResponseType value) {
        return mqObjectFactory.createUpdateOrganizationResponse(value);
    }

    @Override
    public UpdateOrganizationResponseType createType() {
        return mqObjectFactory.createUpdateOrganizationResponseType();
    }
}

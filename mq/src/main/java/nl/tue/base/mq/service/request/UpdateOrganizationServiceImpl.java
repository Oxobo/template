package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.UpdateOrganizationRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.UpdateOrganizationRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class UpdateOrganizationServiceImpl implements UpdateOrganizationRequestService {


    private MqObjectFactory mqObjectFactory;

    @Autowired
    public UpdateOrganizationServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }

    @Override
    public UpdateOrganizationRequestType createType() {
        return mqObjectFactory.createUpdateOrganizationRequestType();
    }

    @Override
    public JAXBElement<UpdateOrganizationRequestType> createElement(UpdateOrganizationRequestType value) {
        return mqObjectFactory.createUpdateOrganizationRequest(value);
    }
}

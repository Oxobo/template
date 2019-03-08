package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.CreateOrganizationRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.CreateOrganizationRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class CreateOrganizationRequestServiceImpl implements CreateOrganizationRequestService {

    @Autowired
    private MqObjectFactory mqObjectFactory;

    @Override
    public CreateOrganizationRequestType createType() {
        return mqObjectFactory.createCreateOrganizationRequestType();
    }

    @Override
    public JAXBElement<CreateOrganizationRequestType> createElement(CreateOrganizationRequestType value) {
        return mqObjectFactory.createCreateOrganizationRequest(value);
    }
}

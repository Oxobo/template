package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.GetOrganizationByIdentifierRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.GetOrganizationByIdentifierRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetOrganizationByIdentifierRequestServiceImpl implements GetOrganizationByIdentifierRequestService {

    @Autowired
    private MqObjectFactory mqObjectFactory;

    @Override
    public GetOrganizationByIdentifierRequestType createType() {
        return mqObjectFactory.createGetOrganizationByIdentifierRequestType();
    }

    @Override
    public JAXBElement<GetOrganizationByIdentifierRequestType> createElement(GetOrganizationByIdentifierRequestType value) {
        return mqObjectFactory.createGetOrganizationByIdentifierRequest(value);
    }
}

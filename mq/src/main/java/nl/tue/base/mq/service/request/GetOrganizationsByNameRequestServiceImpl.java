package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.GetOrganizationsByNameRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.GetOrganizationsByNameRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetOrganizationsByNameRequestServiceImpl implements GetOrganizationsByNameRequestService {

    @Autowired
    private MqObjectFactory mqObjectFactory;

    @Override
    public GetOrganizationsByNameRequestType createType() {
        return mqObjectFactory.createGetOrganizationsByNameRequestType();
    }

    @Override
    public JAXBElement<GetOrganizationsByNameRequestType> createElement(GetOrganizationsByNameRequestType value) {
        return mqObjectFactory.createGetOrganizationsByNameRequest(value);
    }
}

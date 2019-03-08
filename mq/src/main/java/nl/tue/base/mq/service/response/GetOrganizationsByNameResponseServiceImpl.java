package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.GetOrganizationsByNameResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.GetOrganizationsByNameResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetOrganizationsByNameResponseServiceImpl implements GetOrganizationsByNameResponseService {

    private MqObjectFactory mqObjectFactory;

    @Autowired
    public GetOrganizationsByNameResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<GetOrganizationsByNameResponseType> 
                createElement(GetOrganizationsByNameResponseType value) {
        return mqObjectFactory.createGetOrganizationsByNameResponse(value);
    }

    @Override
    public GetOrganizationsByNameResponseType createType() {
        return mqObjectFactory.createGetOrganizationsByNameResponseType();
    }
}

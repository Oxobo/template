package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.GetOrganizationByIdentifierResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.GetOrganizationByIdentifierResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetOrganizationByIdentifierResponseServiceImpl implements GetOrganizationByIdentifierResponseService {

    private MqObjectFactory mqObjectFactory;

    @Autowired
    public GetOrganizationByIdentifierResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<GetOrganizationByIdentifierResponseType> 
                createElement(GetOrganizationByIdentifierResponseType value) {
        return mqObjectFactory.createGetOrganizationByIdentifierResponse(value);
    }

    @Override
    public GetOrganizationByIdentifierResponseType createType() {
        return mqObjectFactory.createGetOrganizationByIdentifierResponseType();
    }
}

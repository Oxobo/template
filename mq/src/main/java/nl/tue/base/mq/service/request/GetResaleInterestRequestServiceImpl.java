package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.GetResaleInterestRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.GetResaleInterestRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetResaleInterestRequestServiceImpl implements GetResaleInterestRequestService {

    @Autowired
    private MqObjectFactory mqObjectFactory;

    @Override
    public GetResaleInterestRequestType createType() {
        return mqObjectFactory.createGetResaleInterestRequestType();
    }

    @Override
    public JAXBElement<GetResaleInterestRequestType> createElement(GetResaleInterestRequestType value) {
        return mqObjectFactory.createGetResaleInterestRequest(value);
    }
}

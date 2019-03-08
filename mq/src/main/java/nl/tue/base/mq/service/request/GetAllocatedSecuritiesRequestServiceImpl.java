package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.GetAllocatedSecuritiesRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.GetAllocatedSecuritiesRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetAllocatedSecuritiesRequestServiceImpl implements GetAllocatedSecuritiesRequestService {

    @Autowired
    private MqObjectFactory mqObjectFactory;

    @Override
    public GetAllocatedSecuritiesRequestType createType() {
        return mqObjectFactory.createGetAllocatedSecuritiesRequestType();
    }

    @Override
    public JAXBElement<GetAllocatedSecuritiesRequestType> createElement(GetAllocatedSecuritiesRequestType value) {
        return mqObjectFactory.createGetAllocatedSecuritiesRequest(value);
    }
}

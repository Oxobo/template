package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.GetAllocatedSecuritiesResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.GetAllocatedSecuritiesResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetAllocatedSecuritiesResponseServiceImpl implements GetAllocatedSecuritiesResponseService {

    private MqObjectFactory mqObjectFactory;

    @Autowired
    public GetAllocatedSecuritiesResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<GetAllocatedSecuritiesResponseType> 
                createElement(GetAllocatedSecuritiesResponseType value) {
        return mqObjectFactory.createGetAllocatedSecuritiesResponse(value);
    }

    @Override
    public GetAllocatedSecuritiesResponseType createType() {
        return mqObjectFactory.createGetAllocatedSecuritiesResponseType();
    }
}

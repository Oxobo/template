package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.GetAllocatedSecuritiesCodesResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.GetAllocatedSecuritiesCodesResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetAllocatedSecuritiesCodesResponseServiceImpl implements GetAllocatedSecuritiesCodesResponseService {

    private MqObjectFactory mqObjectFactory;

    @Autowired
    public GetAllocatedSecuritiesCodesResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<GetAllocatedSecuritiesCodesResponseType> 
                createElement(GetAllocatedSecuritiesCodesResponseType value) {
        return mqObjectFactory.createGetAllocatedSecuritiesCodesResponse(value);
    }

    @Override
    public GetAllocatedSecuritiesCodesResponseType createType() {
        return mqObjectFactory.createGetAllocatedSecuritiesCodesResponseType();
    }
}

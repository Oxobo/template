package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.GetRedemptionInterestResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.GetRedemptionInterestResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetRedemptionInterestResponseServiceImpl implements GetRedemptionInterestResponseService {

    private MqObjectFactory mqObjectFactory;

    @Autowired
    public GetRedemptionInterestResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<GetRedemptionInterestResponseType> 
                createElement(GetRedemptionInterestResponseType value) {
        return mqObjectFactory.createGetRedemptionInterestResponse(value);
    }

    @Override
    public GetRedemptionInterestResponseType createType() {
        return mqObjectFactory.createGetRedemptionInterestResponseType();
    }
}

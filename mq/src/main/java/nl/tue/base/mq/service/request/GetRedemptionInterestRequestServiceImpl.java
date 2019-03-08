package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.GetRedemptionInterestRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.GetRedemptionInterestRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetRedemptionInterestRequestServiceImpl implements GetRedemptionInterestRequestService {

    @Autowired
    private MqObjectFactory mqObjectFactory;

    @Override
    public GetRedemptionInterestRequestType createType() {
        return mqObjectFactory.createGetRedemptionInterestRequestType();
    }

    @Override
    public JAXBElement<GetRedemptionInterestRequestType> createElement(GetRedemptionInterestRequestType value) {
        return mqObjectFactory.createGetRedemptionInterestRequest(value);
    }
}

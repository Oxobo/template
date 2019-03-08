package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.GetSecuritiesForRedemptionRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.GetSecuritiesForRedemptionRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSecuritiesForRedemptionRequestServiceImpl implements GetSecuritiesForRedemptionRequestService {

    @Autowired
    private MqObjectFactory mqObjectFactory;

    @Override
    public GetSecuritiesForRedemptionRequestType createType() {
        return mqObjectFactory.createGetSecuritiesForRedemptionRequestType();
    }

    @Override
    public JAXBElement<GetSecuritiesForRedemptionRequestType> createElement(GetSecuritiesForRedemptionRequestType value) {
        return mqObjectFactory.createGetSecuritiesForRedemptionRequest(value);
    }
}

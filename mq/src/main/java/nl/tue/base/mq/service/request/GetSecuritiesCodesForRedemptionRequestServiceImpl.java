package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.GetSecuritiesCodesForRedemptionRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.GetSecuritiesCodesForRedemptionRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSecuritiesCodesForRedemptionRequestServiceImpl implements GetSecuritiesCodesForRedemptionRequestService {

    @Autowired
    private MqObjectFactory mqObjectFactory;

    @Override
    public GetSecuritiesCodesForRedemptionRequestType createType() {
        return mqObjectFactory.createGetSecuritiesCodesForRedemptionRequestType();
    }

    @Override
    public JAXBElement<GetSecuritiesCodesForRedemptionRequestType> createElement(GetSecuritiesCodesForRedemptionRequestType value) {
        return mqObjectFactory.createGetSecuritiesCodesForRedemptionRequest(value);
    }
}

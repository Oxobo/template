package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.GetSecuritiesForRedemptionResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.GetSecuritiesForRedemptionResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSecuritiesForRedemptionResponseServiceImpl
                    implements GetSecuritiesForRedemptionResponseService {

    private MqObjectFactory mqObjectFactory;

    @Autowired
    public GetSecuritiesForRedemptionResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<GetSecuritiesForRedemptionResponseType> 
                createElement(GetSecuritiesForRedemptionResponseType value) {
        return mqObjectFactory.createGetSecuritiesForRedemptionResponse(value);
    }

    @Override
    public GetSecuritiesForRedemptionResponseType createType() {
        return mqObjectFactory.createGetSecuritiesForRedemptionResponseType();
    }
}

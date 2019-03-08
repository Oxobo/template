package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.GetSecuritiesCodesForRedemptionResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.GetSecuritiesCodesForRedemptionResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSecuritiesCodesForRedemptionResponseServiceImpl
                    implements GetSecuritiesCodesForRedemptionResponseService {

    private MqObjectFactory mqObjectFactory;

    @Autowired
    public GetSecuritiesCodesForRedemptionResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<GetSecuritiesCodesForRedemptionResponseType> 
                createElement(GetSecuritiesCodesForRedemptionResponseType value) {
        return mqObjectFactory.createGetSecuritiesCodesForRedemptionResponse(value);
    }

    @Override
    public GetSecuritiesCodesForRedemptionResponseType createType() {
        return mqObjectFactory.createGetSecuritiesCodesForRedemptionResponseType();
    }
}

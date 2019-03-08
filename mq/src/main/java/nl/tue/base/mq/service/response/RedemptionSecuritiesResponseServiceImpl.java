package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.RedemptionSecuritiesResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.RedemptionSecuritiesResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class RedemptionSecuritiesResponseServiceImpl
                    implements RedemptionSecuritiesResponseService {

    private MqObjectFactory mqObjectFactory;

    @Autowired
    public RedemptionSecuritiesResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<RedemptionSecuritiesResponseType> 
                createElement(RedemptionSecuritiesResponseType value) {
        return mqObjectFactory.createRedemptionSecuritiesResponse(value);
    }

    @Override
    public RedemptionSecuritiesResponseType createType() {
        return mqObjectFactory.createRedemptionSecuritiesResponseType();
    }
}

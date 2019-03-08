package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.CancelRedemptionSecuritiesResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.CancelRedemptionSecuritiesResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class CancelRedemptionSecuritiesResponseServiceImpl implements CancelRedemptionSecuritiesResponseService {
    
    private MqObjectFactory mqObjectFactory;

    @Autowired
    public CancelRedemptionSecuritiesResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<CancelRedemptionSecuritiesResponseType> 
                createElement(CancelRedemptionSecuritiesResponseType value) {
        return mqObjectFactory.createCancelRedemptionSecuritiesResponse(value);
    }

    @Override
    public CancelRedemptionSecuritiesResponseType createType() {
        return mqObjectFactory.createCancelRedemptionSecuritiesResponseType();
    }
}

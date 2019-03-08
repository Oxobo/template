package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.RedemptionSecuritiesRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.RedemptionSecuritiesRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class RedemptionSecuritiesRequestServiceImpl implements RedemptionSecuritiesRequestService {

    @Autowired
    private MqObjectFactory mqObjectFactory;


    @Override
    public RedemptionSecuritiesRequestType createType() {
        return mqObjectFactory.createRedemptionSecuritiesRequestType();
    }

    @Override
    public JAXBElement<RedemptionSecuritiesRequestType> createElement(RedemptionSecuritiesRequestType value) {
        return mqObjectFactory.createRedemptionSecuritiesRequest(value);
    }
}

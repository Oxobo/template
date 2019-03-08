package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.CancelRedemptionSecuritiesRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.CancelRedemptionSecuritiesRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class CancelRedemptionSecuritiesRequestServiceImpl implements CancelRedemptionSecuritiesRequestService {

    @Autowired
    private MqObjectFactory mqObjectFactory;

    @Override
    public CancelRedemptionSecuritiesRequestType createType() {
        return mqObjectFactory.createCancelRedemptionSecuritiesRequestType();
    }

    @Override
    public JAXBElement<CancelRedemptionSecuritiesRequestType> createElement(CancelRedemptionSecuritiesRequestType value) {
        return mqObjectFactory.createCancelRedemptionSecuritiesRequest(value);
    }
}

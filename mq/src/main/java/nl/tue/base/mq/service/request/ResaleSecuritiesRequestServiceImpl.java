package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.ResaleSecuritiesRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.ResaleSecuritiesRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class ResaleSecuritiesRequestServiceImpl implements ResaleSecuritiesRequestService {

    @Autowired
    private MqObjectFactory mqObjectFactory;


    @Override
    public ResaleSecuritiesRequestType createType() {
        return mqObjectFactory.createResaleSecuritiesRequestType();
    }

    @Override
    public JAXBElement<ResaleSecuritiesRequestType> createElement(ResaleSecuritiesRequestType value) {
        return mqObjectFactory.createResaleSecuritiesRequest(value);
    }
}

package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.ResaleSecuritiesResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.ResaleSecuritiesResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class ResaleSecuritiesResponseServiceImpl
                    implements ResaleSecuritiesResponseService {

    private MqObjectFactory mqObjectFactory;

    @Autowired
    public ResaleSecuritiesResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<ResaleSecuritiesResponseType> 
                createElement(ResaleSecuritiesResponseType value) {
        return mqObjectFactory.createResaleSecuritiesResponse(value);
    }

    @Override
    public ResaleSecuritiesResponseType createType() {
        return mqObjectFactory.createResaleSecuritiesResponseType();
    }
}

package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.CancelResaleSecuritiesResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.CancelResaleSecuritiesResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class CancelResaleSecuritiesResponseServiceImpl implements CancelResaleSecuritiesResponseService {
    
    private MqObjectFactory mqObjectFactory;

    @Autowired
    public CancelResaleSecuritiesResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<CancelResaleSecuritiesResponseType> 
                createElement(CancelResaleSecuritiesResponseType value) {
        return mqObjectFactory.createCancelResaleSecuritiesResponse(value);
    }

    @Override
    public CancelResaleSecuritiesResponseType createType() {
        return mqObjectFactory.createCancelResaleSecuritiesResponseType();
    }
}

package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.ApproveSaleSecuritiesResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.ApproveSaleSecuritiesResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class ApproveSaleSecuritiesResponseServiceImpl implements ApproveSaleSecuritiesResponseService {
    
    private MqObjectFactory mqObjectFactory;

    @Autowired
    public ApproveSaleSecuritiesResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<ApproveSaleSecuritiesResponseType> 
                createElement(ApproveSaleSecuritiesResponseType value) {
        return mqObjectFactory.createApproveSaleSecuritiesResponse(value);
    }

    @Override
    public ApproveSaleSecuritiesResponseType createType() {
        return mqObjectFactory.createApproveSaleSecuritiesResponseType();
    }
}

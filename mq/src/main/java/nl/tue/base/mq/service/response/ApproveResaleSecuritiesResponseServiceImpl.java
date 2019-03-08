package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.ApproveResaleSecuritiesResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.ApproveResaleSecuritiesResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class ApproveResaleSecuritiesResponseServiceImpl implements ApproveResaleSecuritiesResponseService {
    
    private MqObjectFactory mqObjectFactory;

    @Autowired
    public ApproveResaleSecuritiesResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<ApproveResaleSecuritiesResponseType> 
                createElement(ApproveResaleSecuritiesResponseType value) {
        return mqObjectFactory.createApproveResaleSecuritiesResponse(value);
    }

    @Override
    public ApproveResaleSecuritiesResponseType createType() {
        return mqObjectFactory.createApproveResaleSecuritiesResponseType();
    }
}

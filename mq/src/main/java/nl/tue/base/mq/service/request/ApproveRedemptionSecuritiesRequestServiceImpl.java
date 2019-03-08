package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.ApproveRedemptionSecuritiesRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.ApproveRedemptionSecuritiesRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class ApproveRedemptionSecuritiesRequestServiceImpl implements ApproveRedemptionSecuritiesRequestService {

    @Autowired
    private MqObjectFactory mqObjectFactory;

    public ApproveRedemptionSecuritiesRequestType createType(){
        return mqObjectFactory.createApproveRedemptionSecuritiesRequestType();
    }


    public JAXBElement<ApproveRedemptionSecuritiesRequestType> createElement(ApproveRedemptionSecuritiesRequestType value){
        return mqObjectFactory.createApproveRedemptionSecuritiesRequest(value);
    }

}

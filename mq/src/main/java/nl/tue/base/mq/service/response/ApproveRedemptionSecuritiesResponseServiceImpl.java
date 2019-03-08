package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.ApproveRedemptionSecuritiesResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.ApproveRedemptionSecuritiesResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class ApproveRedemptionSecuritiesResponseServiceImpl implements ApproveRedemptionSecuritiesResponseService {

    private MqObjectFactory mqObjectFactory;

    @Autowired
    public ApproveRedemptionSecuritiesResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<ApproveRedemptionSecuritiesResponseType>
                createElement(ApproveRedemptionSecuritiesResponseType value) {
        return mqObjectFactory.createApproveRedemptionSecuritiesResponse(value);
    }

    @Override
    public ApproveRedemptionSecuritiesResponseType createType() {
        return mqObjectFactory.createApproveRedemptionSecuritiesResponseType();
    }
}

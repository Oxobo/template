package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.ApproveTransferSecuritiesResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.ApproveTransferSecuritiesResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class ApproveTransferSecuritiesResponseServiceImpl implements ApproveTransferSecuritiesResponseService {
    
    private MqObjectFactory mqObjectFactory;

    @Autowired
    public ApproveTransferSecuritiesResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<ApproveTransferSecuritiesResponseType> 
                createElement(ApproveTransferSecuritiesResponseType value) {
        return mqObjectFactory.createApproveTransferSecuritiesResponse(value);
    }

    @Override
    public ApproveTransferSecuritiesResponseType createType() {
        return mqObjectFactory.createApproveTransferSecuritiesResponseType();
    }
}

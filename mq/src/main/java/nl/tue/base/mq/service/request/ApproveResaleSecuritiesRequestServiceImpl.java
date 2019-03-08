package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.ApproveResaleSecuritiesRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.ApproveResaleSecuritiesRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class ApproveResaleSecuritiesRequestServiceImpl implements ApproveResaleSecuritiesRequestService {

    @Autowired
    private MqObjectFactory mqObjectFactory;

    @Override
    public ApproveResaleSecuritiesRequestType createType() {
        return mqObjectFactory.createApproveResaleSecuritiesRequestType();
    }

    @Override
    public JAXBElement<ApproveResaleSecuritiesRequestType> createElement(ApproveResaleSecuritiesRequestType value) {
        return mqObjectFactory.createApproveResaleSecuritiesRequest(value);
    }
}

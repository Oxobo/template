package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.ApproveTransferSecuritiesRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.ApproveTransferSecuritiesRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class ApproveTransferSecuritiesRequestServiceImpl implements ApproveTransferSecuritiesRequestService {

    @Autowired
    private MqObjectFactory mqObjectFactory;

    @Override
    public ApproveTransferSecuritiesRequestType createType() {
        return mqObjectFactory.createApproveTransferSecuritiesRequestType();
    }

    @Override
    public JAXBElement<ApproveTransferSecuritiesRequestType> createElement(ApproveTransferSecuritiesRequestType value) {
        return mqObjectFactory.createApproveTransferSecuritiesRequest(value);
    }
}

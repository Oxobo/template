package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.ApproveSaleSecuritiesRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.ApproveSaleSecuritiesRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class ApproveSaleSecuritiesRequestServiceImpl implements ApproveSaleSecuritiesRequestService {
    @Autowired
    private MqObjectFactory mqObjectFactory;

    @Override
    public ApproveSaleSecuritiesRequestType createType() {
        return mqObjectFactory.createApproveSaleSecuritiesRequestType();
    }

    @Override
    public JAXBElement<ApproveSaleSecuritiesRequestType> createElement(ApproveSaleSecuritiesRequestType value) {
        return mqObjectFactory.createApproveSaleSecuritiesRequest(value);
    }
}

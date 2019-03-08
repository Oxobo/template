package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.GetSecuritiesForTransferRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.GetSecuritiesForTransferRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSecuritiesForTransferRequestServiceImpl implements GetSecuritiesForTransferRequestService {

    @Autowired
    private MqObjectFactory mqObjectFactory;

    @Override
    public GetSecuritiesForTransferRequestType createType() {
        return mqObjectFactory.createGetSecuritiesForTransferRequestType();
    }

    @Override
    public JAXBElement<GetSecuritiesForTransferRequestType> createElement(GetSecuritiesForTransferRequestType value) {
        return mqObjectFactory.createGetSecuritiesForTransferRequest(value);
    }
}

package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.GetSecuritiesCodesForTransferRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.GetSecuritiesCodesForTransferRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSecuritiesCodesForTransferRequestServiceImpl implements GetSecuritiesCodesForTransferRequestService {

    @Autowired
    private MqObjectFactory mqObjectFactory;

    @Override
    public GetSecuritiesCodesForTransferRequestType createType() {
        return mqObjectFactory.createGetSecuritiesCodesForTransferRequestType();
    }

    @Override
    public JAXBElement<GetSecuritiesCodesForTransferRequestType> createElement(GetSecuritiesCodesForTransferRequestType value) {
        return mqObjectFactory.createGetSecuritiesCodesForTransferRequest(value);
    }
}

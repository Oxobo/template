package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.CancelTransferSecuritiesRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.CancelTransferSecuritiesRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class CancelTransferSecuritiesRequestServiceImpl implements CancelTransferSecuritiesRequestService {

    @Autowired
    private MqObjectFactory mqObjectFactory;

    @Override
    public CancelTransferSecuritiesRequestType createType() {
        return mqObjectFactory.createCancelTransferSecuritiesRequestType();
    }

    @Override
    public JAXBElement<CancelTransferSecuritiesRequestType> createElement(CancelTransferSecuritiesRequestType value) {
        return mqObjectFactory.createCancelTransferSecuritiesRequest(value);
    }
}

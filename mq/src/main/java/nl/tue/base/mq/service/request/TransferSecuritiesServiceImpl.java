package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.TransferSecuritiesRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.TransferSecuritiesRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class TransferSecuritiesServiceImpl implements TransferSecuritiesRequestService {


    private MqObjectFactory mqObjectFactory;

    @Autowired
    public TransferSecuritiesServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }

    @Override
    public TransferSecuritiesRequestType createType() {
        return mqObjectFactory.createTransferSecuritiesRequestType();
    }

    @Override
    public JAXBElement<TransferSecuritiesRequestType> createElement(TransferSecuritiesRequestType value) {
        return mqObjectFactory.createTransferSecuritiesRequest(value);
    }
}

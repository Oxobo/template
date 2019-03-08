package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.TransferSecuritiesResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.TransferSecuritiesResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class TransferSecuritiesResponseServiceImpl
                    implements TransferSecuritiesResponseService {

    private MqObjectFactory mqObjectFactory;

    @Autowired
    public TransferSecuritiesResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<TransferSecuritiesResponseType> 
                createElement(TransferSecuritiesResponseType value) {
        return mqObjectFactory.createTransferSecuritiesResponse(value);
    }

    @Override
    public TransferSecuritiesResponseType createType() {
        return mqObjectFactory.createTransferSecuritiesResponseType();
    }
}

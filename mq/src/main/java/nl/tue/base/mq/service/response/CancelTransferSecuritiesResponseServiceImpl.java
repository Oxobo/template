package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.CancelTransferSecuritiesResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.CancelTransferSecuritiesResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class CancelTransferSecuritiesResponseServiceImpl implements CancelTransferSecuritiesResponseService {
    
    private MqObjectFactory mqObjectFactory;

    @Autowired
    public CancelTransferSecuritiesResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<CancelTransferSecuritiesResponseType> 
                createElement(CancelTransferSecuritiesResponseType value) {
        return mqObjectFactory.createCancelTransferSecuritiesResponse(value);
    }

    @Override
    public CancelTransferSecuritiesResponseType createType() {
        return mqObjectFactory.createCancelTransferSecuritiesResponseType();
    }
}

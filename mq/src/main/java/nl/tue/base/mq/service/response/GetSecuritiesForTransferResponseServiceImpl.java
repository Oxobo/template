package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.GetSecuritiesForTransferResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.GetSecuritiesForTransferResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSecuritiesForTransferResponseServiceImpl
                    implements GetSecuritiesForTransferResponseService {

    private MqObjectFactory mqObjectFactory;

    @Autowired
    public GetSecuritiesForTransferResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<GetSecuritiesForTransferResponseType> 
                createElement(GetSecuritiesForTransferResponseType value) {
        return mqObjectFactory.createGetSecuritiesForTransferResponse(value);
    }

    @Override
    public GetSecuritiesForTransferResponseType createType() {
        return mqObjectFactory.createGetSecuritiesForTransferResponseType();
    }
}

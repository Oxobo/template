package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.GetSecuritiesCodesForTransferResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.GetSecuritiesCodesForTransferResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSecuritiesCodesForTransferResponseServiceImpl
                    implements GetSecuritiesCodesForTransferResponseService {

    private MqObjectFactory mqObjectFactory;

    @Autowired
    public GetSecuritiesCodesForTransferResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<GetSecuritiesCodesForTransferResponseType> 
                createElement(GetSecuritiesCodesForTransferResponseType value) {
        return mqObjectFactory.createGetSecuritiesCodesForTransferResponse(value);
    }

    @Override
    public GetSecuritiesCodesForTransferResponseType createType() {
        return mqObjectFactory.createGetSecuritiesCodesForTransferResponseType();
    }
}

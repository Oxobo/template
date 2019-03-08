package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.GetSecuritiesForResaleResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.GetSecuritiesForResaleResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSecuritiesForResaleResponseServiceImpl
                    implements GetSecuritiesForResaleResponseService {

    private MqObjectFactory mqObjectFactory;

    @Autowired
    public GetSecuritiesForResaleResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<GetSecuritiesForResaleResponseType> 
                createElement(GetSecuritiesForResaleResponseType value) {
        return mqObjectFactory.createGetSecuritiesForResaleResponse(value);
    }

    @Override
    public GetSecuritiesForResaleResponseType createType() {
        return mqObjectFactory.createGetSecuritiesForResaleResponseType();
    }
}

package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.GetSecuritiesCodesForResaleResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.GetSecuritiesCodesForResaleResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSecuritiesCodesForResaleResponseServiceImpl
                    implements GetSecuritiesCodesForResaleResponseService {

    private MqObjectFactory mqObjectFactory;

    @Autowired
    public GetSecuritiesCodesForResaleResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<GetSecuritiesCodesForResaleResponseType> 
                createElement(GetSecuritiesCodesForResaleResponseType value) {
        return mqObjectFactory.createGetSecuritiesCodesForResaleResponse(value);
    }

    @Override
    public GetSecuritiesCodesForResaleResponseType createType() {
        return mqObjectFactory.createGetSecuritiesCodesForResaleResponseType();
    }
}

package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.GetSecuritiesForSaleResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.GetSecuritiesForSaleResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSecuritiesForSaleResponseServiceImpl
                    implements GetSecuritiesForSaleResponseService {

    private MqObjectFactory mqObjectFactory;

    @Autowired
    public GetSecuritiesForSaleResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<GetSecuritiesForSaleResponseType> 
                createElement(GetSecuritiesForSaleResponseType value) {
        return mqObjectFactory.createGetSecuritiesForSaleResponse(value);
    }

    @Override
    public GetSecuritiesForSaleResponseType createType() {
        return mqObjectFactory.createGetSecuritiesForSaleResponseType();
    }
}

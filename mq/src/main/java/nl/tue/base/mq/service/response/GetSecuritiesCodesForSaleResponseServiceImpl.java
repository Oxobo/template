package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.GetSecuritiesCodesForSaleResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.GetSecuritiesCodesForSaleResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSecuritiesCodesForSaleResponseServiceImpl
                    implements GetSecuritiesCodesForSaleResponseService {

    private MqObjectFactory mqObjectFactory;

    @Autowired
    public GetSecuritiesCodesForSaleResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<GetSecuritiesCodesForSaleResponseType> 
                createElement(GetSecuritiesCodesForSaleResponseType value) {
        return mqObjectFactory.createGetSecuritiesCodesForSaleResponse(value);
    }

    @Override
    public GetSecuritiesCodesForSaleResponseType createType() {
        return mqObjectFactory.createGetSecuritiesCodesForSaleResponseType();
    }
}

package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.SaleSecuritiesResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.SaleSecuritiesResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class SaleSecuritiesResponseServiceImpl
                    implements SaleSecuritiesResponseService {

    private MqObjectFactory mqObjectFactory;

    @Autowired
    public SaleSecuritiesResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<SaleSecuritiesResponseType> 
                createElement(SaleSecuritiesResponseType value) {
        return mqObjectFactory.createSaleSecuritiesResponse(value);
    }

    @Override
    public SaleSecuritiesResponseType createType() {
        return mqObjectFactory.createSaleSecuritiesResponseType();
    }
}

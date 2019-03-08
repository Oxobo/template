package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.CancelSaleSecuritiesResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.CancelSaleSecuritiesResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class CancelSaleSecuritiesResponseServiceImpl implements CancelSaleSecuritiesResponseService {
    
    private MqObjectFactory mqObjectFactory;

    @Autowired
    public CancelSaleSecuritiesResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<CancelSaleSecuritiesResponseType> 
                createElement(CancelSaleSecuritiesResponseType value) {
        return mqObjectFactory.createCancelSaleSecuritiesResponse(value);
    }

    @Override
    public CancelSaleSecuritiesResponseType createType() {
        return mqObjectFactory.createCancelSaleSecuritiesResponseType();
    }
}

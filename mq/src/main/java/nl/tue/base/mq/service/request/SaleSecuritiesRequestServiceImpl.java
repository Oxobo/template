package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.SaleSecuritiesRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.SaleSecuritiesRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class SaleSecuritiesRequestServiceImpl implements SaleSecuritiesRequestService {

    @Autowired
    private MqObjectFactory mqObjectFactory;


    @Override
    public SaleSecuritiesRequestType createType() {
        return mqObjectFactory.createSaleSecuritiesRequestType();
    }

    @Override
    public JAXBElement<SaleSecuritiesRequestType> createElement(SaleSecuritiesRequestType value) {
        return mqObjectFactory.createSaleSecuritiesRequest(value);
    }
}

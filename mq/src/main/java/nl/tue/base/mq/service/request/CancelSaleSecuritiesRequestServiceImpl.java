package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.CancelSaleSecuritiesRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.CancelSaleSecuritiesRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class CancelSaleSecuritiesRequestServiceImpl implements CancelSaleSecuritiesRequestService {

    @Autowired
    private MqObjectFactory mqObjectFactory;

    @Override
    public CancelSaleSecuritiesRequestType createType() {
        return mqObjectFactory.createCancelSaleSecuritiesRequestType();
    }

    @Override
    public JAXBElement<CancelSaleSecuritiesRequestType> createElement(CancelSaleSecuritiesRequestType value) {
        return mqObjectFactory.createCancelSaleSecuritiesRequest(value);
    }
}

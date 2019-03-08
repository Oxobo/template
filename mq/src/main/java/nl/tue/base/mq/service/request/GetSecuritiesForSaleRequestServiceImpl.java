package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.GetSecuritiesForSaleRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.GetSecuritiesForSaleRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSecuritiesForSaleRequestServiceImpl implements GetSecuritiesForSaleRequestService {

    @Autowired
    private MqObjectFactory mqObjectFactory;

    @Override
    public GetSecuritiesForSaleRequestType createType() {
        return mqObjectFactory.createGetSecuritiesForSaleRequestType();
    }

    @Override
    public JAXBElement<GetSecuritiesForSaleRequestType> createElement(GetSecuritiesForSaleRequestType value) {
        return mqObjectFactory.createGetSecuritiesForSaleRequest(value);
    }
}

package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.GetSecuritiesCodesForSaleRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.GetSecuritiesCodesForSaleRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSecuritiesCodesForSaleRequestServiceImpl implements GetSecuritiesCodesForSaleRequestService {

    @Autowired
    private MqObjectFactory mqObjectFactory;

    @Override
    public GetSecuritiesCodesForSaleRequestType createType() {
        return mqObjectFactory.createGetSecuritiesCodesForSaleRequestType();
    }

    @Override
    public JAXBElement<GetSecuritiesCodesForSaleRequestType> createElement(GetSecuritiesCodesForSaleRequestType value) {
        return mqObjectFactory.createGetSecuritiesCodesForSaleRequest(value);
    }
}

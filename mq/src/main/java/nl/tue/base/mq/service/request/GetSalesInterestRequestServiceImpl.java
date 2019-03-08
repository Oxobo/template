package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.GetSalesInterestRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.GetSalesInterestRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSalesInterestRequestServiceImpl implements GetSalesInterestRequestService {

    @Autowired
    private MqObjectFactory mqObjectFactory;

    @Override
    public GetSalesInterestRequestType createType() {
        return mqObjectFactory.createGetSalesInterestRequestType();
    }

    @Override
    public JAXBElement<GetSalesInterestRequestType> createElement(GetSalesInterestRequestType value) {
        return mqObjectFactory.createGetSalesInterestRequest(value);
    }
}

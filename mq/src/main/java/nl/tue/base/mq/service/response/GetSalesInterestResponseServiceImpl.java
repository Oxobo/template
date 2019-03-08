package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.GetSalesInterestResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.GetSalesInterestResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSalesInterestResponseServiceImpl implements GetSalesInterestResponseService {

    private MqObjectFactory mqObjectFactory;

    @Autowired
    public GetSalesInterestResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<GetSalesInterestResponseType> 
                createElement(GetSalesInterestResponseType value) {
        return mqObjectFactory.createGetSalesInterestResponse(value);
    }

    @Override
    public GetSalesInterestResponseType createType() {
        return mqObjectFactory.createGetSalesInterestResponseType();
    }
}

package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.GetSecuritiesCouponsDateResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.GetSecuritiesCouponsDateResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSecuritiesCouponsDateResponseServiceImpl
                    implements GetSecuritiesCouponsDateResponseService {

    private MqObjectFactory mqObjectFactory;

    @Autowired
    public GetSecuritiesCouponsDateResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<GetSecuritiesCouponsDateResponseType> 
                createElement(GetSecuritiesCouponsDateResponseType value) {
        return mqObjectFactory.createGetSecuritiesCouponsDateResponse(value);
    }

    @Override
    public GetSecuritiesCouponsDateResponseType createType() {
        return mqObjectFactory.createGetSecuritiesCouponsDateResponseType();
    }
}

package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.GetSecuritiesCouponsDateRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.GetSecuritiesCouponsDateRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSecuritiesCouponsDateRequestServiceImpl implements GetSecuritiesCouponsDateRequestService {

    @Autowired
    private MqObjectFactory mqObjectFactory;

    @Override
    public GetSecuritiesCouponsDateRequestType createType() {
        return mqObjectFactory.createGetSecuritiesCouponsDateRequestType();
    }

    @Override
    public JAXBElement<GetSecuritiesCouponsDateRequestType> createElement(GetSecuritiesCouponsDateRequestType value) {
        return mqObjectFactory.createGetSecuritiesCouponsDateRequest(value);
    }
}

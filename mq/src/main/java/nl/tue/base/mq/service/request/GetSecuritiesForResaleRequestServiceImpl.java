package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.GetSecuritiesForResaleRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.GetSecuritiesForResaleRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSecuritiesForResaleRequestServiceImpl implements GetSecuritiesForResaleRequestService {

    @Autowired
    private MqObjectFactory mqObjectFactory;

    @Override
    public GetSecuritiesForResaleRequestType createType() {
        return mqObjectFactory.createGetSecuritiesForResaleRequestType();
    }

    @Override
    public JAXBElement<GetSecuritiesForResaleRequestType> createElement(GetSecuritiesForResaleRequestType value) {
        return mqObjectFactory.createGetSecuritiesForResaleRequest(value);
    }
}

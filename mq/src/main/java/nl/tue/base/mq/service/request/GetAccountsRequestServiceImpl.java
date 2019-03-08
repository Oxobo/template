package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.GetAccountsRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.GetAccountsRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetAccountsRequestServiceImpl implements GetAccountsRequestService {

    @Autowired
    private MqObjectFactory mqObjectFactory;

    @Override
    public GetAccountsRequestType createType() {
        return mqObjectFactory.createGetAccountsRequestType();
    }

    @Override
    public JAXBElement<GetAccountsRequestType> createElement(GetAccountsRequestType value) {
        return mqObjectFactory.createGetAccountsRequest(value);
    }
}

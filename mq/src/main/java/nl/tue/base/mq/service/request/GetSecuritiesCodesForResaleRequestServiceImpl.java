package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.GetSecuritiesCodesForResaleRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.GetSecuritiesCodesForResaleRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetSecuritiesCodesForResaleRequestServiceImpl implements GetSecuritiesCodesForResaleRequestService {

    @Autowired
    private MqObjectFactory mqObjectFactory;

    @Override
    public GetSecuritiesCodesForResaleRequestType createType() {
        return mqObjectFactory.createGetSecuritiesCodesForResaleRequestType();
    }

    @Override
    public JAXBElement<GetSecuritiesCodesForResaleRequestType> createElement(GetSecuritiesCodesForResaleRequestType value) {
        return mqObjectFactory.createGetSecuritiesCodesForResaleRequest(value);
    }
}

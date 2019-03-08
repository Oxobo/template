package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.GetAllocatedSecuritiesCodesRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.GetAllocatedSecuritiesCodesRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class GetAllocatedSecuritiesCodesRequestServiceImpl implements GetAllocatedSecuritiesCodesRequestService {

    @Autowired
    private MqObjectFactory mqObjectFactory;

    @Override
    public GetAllocatedSecuritiesCodesRequestType createType() {
        return mqObjectFactory.createGetAllocatedSecuritiesCodesRequestType();
    }

    @Override
    public JAXBElement<GetAllocatedSecuritiesCodesRequestType> createElement(GetAllocatedSecuritiesCodesRequestType value) {
        return mqObjectFactory.createGetAllocatedSecuritiesCodesRequest(value);
    }
}

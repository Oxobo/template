package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.CancelResaleSecuritiesRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.CancelResaleSecuritiesRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class CancelResaleSecuritiesRequestServiceImpl implements CancelResaleSecuritiesRequestService {

    @Autowired
    private MqObjectFactory mqObjectFactory;

    @Override
    public CancelResaleSecuritiesRequestType createType() {
        return mqObjectFactory.createCancelResaleSecuritiesRequestType();
    }

    @Override
    public JAXBElement<CancelResaleSecuritiesRequestType> createElement(CancelResaleSecuritiesRequestType value) {
        return mqObjectFactory.createCancelResaleSecuritiesRequest(value);
    }
}

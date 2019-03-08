package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.BlockAccountRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.BlockAccountRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class BlockAccountRequestServiceImpl implements BlockAccountRequestService {

    @Autowired
    private MqObjectFactory mqObjectFactory;

    @Override
    public BlockAccountRequestType createType() {
        return mqObjectFactory.createBlockAccountRequestType();
    }

    @Override
    public JAXBElement<BlockAccountRequestType> createElement(BlockAccountRequestType value) {
        return mqObjectFactory.createBlockAccountRequest(value);
    }
}

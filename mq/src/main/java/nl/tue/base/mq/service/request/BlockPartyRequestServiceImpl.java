package nl.tue.base.mq.service.request;

import nl.tue.base.dto.request.BlockPartyRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.request.BlockPartyRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class BlockPartyRequestServiceImpl implements BlockPartyRequestService {

    @Autowired
    private MqObjectFactory mqObjectFactory;

    @Override
    public BlockPartyRequestType createType() {
        return mqObjectFactory.createBlockPartyRequestType();
    }

    @Override
    public JAXBElement<BlockPartyRequestType> createElement(BlockPartyRequestType value) {
        return mqObjectFactory.createBlockPartyRequest(value);
    }
}

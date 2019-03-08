package nl.tue.base.mq.service.response;

import nl.tue.base.dto.response.BlockAccountResponseType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.response.BlockAccountResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class BlockPartyResponseServiceImpl implements BlockAccountResponseService {

    private MqObjectFactory mqObjectFactory;

    @Autowired
    public BlockPartyResponseServiceImpl(MqObjectFactory mqObjectFactory) {
        this.mqObjectFactory = mqObjectFactory;
    }


    @Override
    public JAXBElement<BlockAccountResponseType> 
                createElement(BlockAccountResponseType value) {
        return mqObjectFactory.createBlockAccountResponse(value);
    }

    @Override
    public BlockAccountResponseType createType() {
        return mqObjectFactory.createBlockAccountResponseType();
    }
}

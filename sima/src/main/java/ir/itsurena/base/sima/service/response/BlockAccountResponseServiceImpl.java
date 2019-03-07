package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.BlockAccountResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.BlockAccountResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class BlockAccountResponseServiceImpl implements BlockAccountResponseService {
    
    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public BlockAccountResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<BlockAccountResponseType> 
                createElement(BlockAccountResponseType value) {
        return simaObjectFactory.createBlockAccountResponse(value);
    }

    @Override
    public BlockAccountResponseType createType() {
        return simaObjectFactory.createBlockAccountResponseType();
    }
}

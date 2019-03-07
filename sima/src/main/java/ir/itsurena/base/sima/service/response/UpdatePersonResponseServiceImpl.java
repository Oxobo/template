package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.UpdatePersonResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.UpdatePersonResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class UpdatePersonResponseServiceImpl
                    implements UpdatePersonResponseService {

    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public UpdatePersonResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<UpdatePersonResponseType> 
                createElement(UpdatePersonResponseType value) {
        return simaObjectFactory.createUpdatePersonResponse(value);
    }

    @Override
    public UpdatePersonResponseType createType() {
        return simaObjectFactory.createUpdatePersonResponseType();
    }
}

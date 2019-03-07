package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.UpdateIbanResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.UpdateIbanResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class UpdateIbanResponseServiceImpl
                    implements UpdateIbanResponseService {

    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public UpdateIbanResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<UpdateIbanResponseType> 
                createElement(UpdateIbanResponseType value) {
        return simaObjectFactory.createUpdateIbanResponse(value);
    }

    @Override
    public UpdateIbanResponseType createType() {
        return simaObjectFactory.createUpdateIbanResponseType();
    }
}

package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.ApproveTransferSecuritiesResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.ApproveTransferSecuritiesResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class ApproveTransferSecuritiesResponseServiceImpl implements ApproveTransferSecuritiesResponseService {
    
    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public ApproveTransferSecuritiesResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<ApproveTransferSecuritiesResponseType> 
                createElement(ApproveTransferSecuritiesResponseType value) {
        return simaObjectFactory.createApproveTransferSecuritiesResponse(value);
    }

    @Override
    public ApproveTransferSecuritiesResponseType createType() {
        return simaObjectFactory.createApproveTransferSecuritiesResponseType();
    }
}

package ir.itsurena.base.sima.service.request;

import ir.itsurena.base.dto.request.ApproveRedemptionSecuritiesRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.request.ApproveRedemptionSecuritiesRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class ApproveRedemptionSecuritiesRequestServiceImpl implements ApproveRedemptionSecuritiesRequestService {

    @Autowired
    private SimaObjectFactory simaObjectFactory;

    public ApproveRedemptionSecuritiesRequestType createType(){
        return simaObjectFactory.createApproveRedemptionSecuritiesRequestType();
    }


    public JAXBElement<ApproveRedemptionSecuritiesRequestType> createElement(ApproveRedemptionSecuritiesRequestType value){
        return simaObjectFactory.createApproveRedemptionSecuritiesRequest(value);
    }

}

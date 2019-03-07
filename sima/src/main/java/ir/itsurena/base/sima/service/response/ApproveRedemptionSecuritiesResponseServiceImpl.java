package ir.itsurena.base.sima.service.response;

import ir.itsurena.base.dto.response.ApproveRedemptionSecuritiesResponseType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.response.ApproveRedemptionSecuritiesResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

@Service
public class ApproveRedemptionSecuritiesResponseServiceImpl implements ApproveRedemptionSecuritiesResponseService {

    private SimaObjectFactory simaObjectFactory;

    @Autowired
    public ApproveRedemptionSecuritiesResponseServiceImpl(SimaObjectFactory simaObjectFactory) {
        this.simaObjectFactory = simaObjectFactory;
    }


    @Override
    public JAXBElement<ApproveRedemptionSecuritiesResponseType>
                createElement(ApproveRedemptionSecuritiesResponseType value) {
        return simaObjectFactory.createApproveRedemptionSecuritiesResponse(value);
    }

    @Override
    public ApproveRedemptionSecuritiesResponseType createType() {
        return simaObjectFactory.createApproveRedemptionSecuritiesResponseType();
    }
}
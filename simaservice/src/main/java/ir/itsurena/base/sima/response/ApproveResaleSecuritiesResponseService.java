package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.ApproveResaleSecuritiesResponseType;

import javax.xml.bind.JAXBElement;

public interface ApproveResaleSecuritiesResponseService extends SimaResponseBaseService {
    JAXBElement<ApproveResaleSecuritiesResponseType>
                createElement(ApproveResaleSecuritiesResponseType value);
}

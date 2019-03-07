package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.ApproveTransferSecuritiesResponseType;

import javax.xml.bind.JAXBElement;

public interface ApproveTransferSecuritiesResponseService extends SimaResponseBaseService {
    JAXBElement<ApproveTransferSecuritiesResponseType>
                createElement(ApproveTransferSecuritiesResponseType value);
}

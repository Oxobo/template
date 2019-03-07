package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.GetSecuritiesForTransferResponseType;

import javax.xml.bind.JAXBElement;

public interface GetSecuritiesForTransferResponseService extends SimaResponseBaseService {
    JAXBElement<GetSecuritiesForTransferResponseType>
                createElement(GetSecuritiesForTransferResponseType value);
}

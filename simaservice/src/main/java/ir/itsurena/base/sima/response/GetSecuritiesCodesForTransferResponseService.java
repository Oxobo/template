package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.GetSecuritiesCodesForTransferResponseType;

import javax.xml.bind.JAXBElement;

public interface GetSecuritiesCodesForTransferResponseService extends SimaResponseBaseService {
    JAXBElement<GetSecuritiesCodesForTransferResponseType>
                createElement(GetSecuritiesCodesForTransferResponseType value);
}

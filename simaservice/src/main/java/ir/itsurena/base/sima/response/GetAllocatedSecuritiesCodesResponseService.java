package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.GetAllocatedSecuritiesCodesResponseType;

import javax.xml.bind.JAXBElement;

public interface GetAllocatedSecuritiesCodesResponseService extends SimaResponseBaseService {
    JAXBElement<GetAllocatedSecuritiesCodesResponseType>
                createElement(GetAllocatedSecuritiesCodesResponseType value);
}

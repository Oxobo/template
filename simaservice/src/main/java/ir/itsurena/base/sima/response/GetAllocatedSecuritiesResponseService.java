package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.GetAllocatedSecuritiesResponseType;

import javax.xml.bind.JAXBElement;

public interface GetAllocatedSecuritiesResponseService extends SimaResponseBaseService {
    JAXBElement<GetAllocatedSecuritiesResponseType>
                createElement(GetAllocatedSecuritiesResponseType value);
}

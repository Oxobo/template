package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.GetResaleInterestResponseType;

import javax.xml.bind.JAXBElement;

public interface GetResaleInterestResponseService extends SimaResponseBaseService {
    JAXBElement<GetResaleInterestResponseType>
                createElement(GetResaleInterestResponseType value);
}

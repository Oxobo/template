package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.GetAccountsResponseType;

import javax.xml.bind.JAXBElement;

public interface GetAccountsResponseService extends SimaResponseBaseService {
    JAXBElement<GetAccountsResponseType>
                createElement(GetAccountsResponseType value);
}

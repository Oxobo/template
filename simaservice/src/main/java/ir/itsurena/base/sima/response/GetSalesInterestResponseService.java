package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.GetSalesInterestResponseType;

import javax.xml.bind.JAXBElement;

public interface GetSalesInterestResponseService extends SimaResponseBaseService {
    JAXBElement<GetSalesInterestResponseType>
                createElement(GetSalesInterestResponseType value);
}

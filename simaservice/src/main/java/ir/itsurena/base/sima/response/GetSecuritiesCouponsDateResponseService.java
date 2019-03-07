package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.GetSecuritiesCouponsDateResponseType;

import javax.xml.bind.JAXBElement;

public interface GetSecuritiesCouponsDateResponseService extends SimaResponseBaseService {
    JAXBElement<GetSecuritiesCouponsDateResponseType>
                createElement(GetSecuritiesCouponsDateResponseType value);
}

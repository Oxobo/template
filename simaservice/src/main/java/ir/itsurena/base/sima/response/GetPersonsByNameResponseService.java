package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.GetPersonsByNameResponseType;

import javax.xml.bind.JAXBElement;

public interface GetPersonsByNameResponseService extends SimaResponseBaseService {
    JAXBElement<GetPersonsByNameResponseType>
                createElement(GetPersonsByNameResponseType value);
}

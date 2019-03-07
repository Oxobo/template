package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.GetPersonByIdentifierResponseType;

import javax.xml.bind.JAXBElement;

public interface GetPersonByIdentifierResponseService extends SimaResponseBaseService {
    JAXBElement<GetPersonByIdentifierResponseType>
                createElement(GetPersonByIdentifierResponseType value);
}

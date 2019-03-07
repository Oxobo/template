package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.CreatePersonResponseType;

import javax.xml.bind.JAXBElement;

public interface CreatePersonResponseService extends SimaResponseBaseService {
    JAXBElement<CreatePersonResponseType>
                createElement(CreatePersonResponseType value);
}

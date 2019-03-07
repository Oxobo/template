package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.UpdatePersonResponseType;

import javax.xml.bind.JAXBElement;

public interface UpdatePersonResponseService extends SimaResponseBaseService {
    JAXBElement<UpdatePersonResponseType>
                createElement(UpdatePersonResponseType value);
}

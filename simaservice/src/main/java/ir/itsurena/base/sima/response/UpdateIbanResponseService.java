package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.UpdateIbanResponseType;

import javax.xml.bind.JAXBElement;

public interface UpdateIbanResponseService extends SimaResponseBaseService {
    JAXBElement<UpdateIbanResponseType>
                createElement(UpdateIbanResponseType value);
}

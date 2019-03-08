package nl.tue.base.mq.response;

import nl.tue.base.dto.response.UpdateIbanResponseType;

import javax.xml.bind.JAXBElement;

public interface UpdateIbanResponseService extends MqResponseBaseService {
    JAXBElement<UpdateIbanResponseType>
                createElement(UpdateIbanResponseType value);
}

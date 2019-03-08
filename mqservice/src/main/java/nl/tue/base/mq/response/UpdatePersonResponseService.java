package nl.tue.base.mq.response;

import nl.tue.base.dto.response.UpdatePersonResponseType;

import javax.xml.bind.JAXBElement;

public interface UpdatePersonResponseService extends MqResponseBaseService {
    JAXBElement<UpdatePersonResponseType>
                createElement(UpdatePersonResponseType value);
}

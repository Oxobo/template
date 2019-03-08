package nl.tue.base.mq.response;

import nl.tue.base.dto.response.GetSecuritiesForTransferResponseType;

import javax.xml.bind.JAXBElement;

public interface GetSecuritiesForTransferResponseService extends MqResponseBaseService {
    JAXBElement<GetSecuritiesForTransferResponseType>
                createElement(GetSecuritiesForTransferResponseType value);
}

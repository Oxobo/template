package nl.tue.base.mq.response;

import nl.tue.base.dto.response.GetSecuritiesCodesForTransferResponseType;

import javax.xml.bind.JAXBElement;

public interface GetSecuritiesCodesForTransferResponseService extends MqResponseBaseService {
    JAXBElement<GetSecuritiesCodesForTransferResponseType>
                createElement(GetSecuritiesCodesForTransferResponseType value);
}

package nl.tue.base.mq.response;

import nl.tue.base.dto.response.ApproveTransferSecuritiesResponseType;

import javax.xml.bind.JAXBElement;

public interface ApproveTransferSecuritiesResponseService extends MqResponseBaseService {
    JAXBElement<ApproveTransferSecuritiesResponseType>
                createElement(ApproveTransferSecuritiesResponseType value);
}

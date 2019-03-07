package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.CreateOrganizationResponseType;

import javax.xml.bind.JAXBElement;

public interface CreateOrganizationResponseService extends SimaResponseBaseService {
    JAXBElement<CreateOrganizationResponseType>
                createElement(CreateOrganizationResponseType value);
}

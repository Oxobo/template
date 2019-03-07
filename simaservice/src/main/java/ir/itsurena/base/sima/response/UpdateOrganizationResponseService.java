package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.UpdateOrganizationResponseType;

import javax.xml.bind.JAXBElement;

public interface UpdateOrganizationResponseService extends SimaResponseBaseService {
    JAXBElement<UpdateOrganizationResponseType>
                createElement(UpdateOrganizationResponseType value);
}

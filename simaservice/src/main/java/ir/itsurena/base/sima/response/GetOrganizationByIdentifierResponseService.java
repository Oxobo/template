package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.GetOrganizationByIdentifierResponseType;

import javax.xml.bind.JAXBElement;

public interface GetOrganizationByIdentifierResponseService extends SimaResponseBaseService {
    JAXBElement<GetOrganizationByIdentifierResponseType>
                createElement(GetOrganizationByIdentifierResponseType value);
}

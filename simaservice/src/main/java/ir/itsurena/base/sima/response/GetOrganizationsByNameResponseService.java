package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.response.GetOrganizationsByNameResponseType;

import javax.xml.bind.JAXBElement;

public interface GetOrganizationsByNameResponseService extends SimaResponseBaseService {
    JAXBElement<GetOrganizationsByNameResponseType>
                createElement(GetOrganizationsByNameResponseType value);
}

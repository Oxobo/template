package ir.itsurena.base.sima.response;

import ir.itsurena.base.dto.request.AbstractRequestType;
import ir.itsurena.base.dto.response.AbstractResponseType;

public interface SimaResponseBaseService {
    <T extends AbstractResponseType> T createType();

}

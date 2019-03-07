package ir.itsurena.base.sima.request;

import ir.itsurena.base.dto.request.AbstractRequestType;

import javax.xml.bind.JAXBElement;

public interface SimaRequestServiceCreator {
    <T extends AbstractRequestType> T createType();

}

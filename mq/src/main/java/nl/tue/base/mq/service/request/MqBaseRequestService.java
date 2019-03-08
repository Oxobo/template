package nl.tue.base.mq.service.request;

import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class MqBaseRequestService {

    @Autowired
    private MqObjectFactory mqObjectFactory;
}

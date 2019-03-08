package nl.tue.base.mq.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@ToString
@Getter
@Setter
@Entity
@Table(name = "MQ_RESPONSE_LOG")
@SequenceGenerator(
        name = "MQ_RESPONSE_LOG_SEQ",
        sequenceName = "MQ_RESPONSE_LOG_SEQ",
        allocationSize = 1
)
public class MqResponseLog {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MQ_RESPONSE_LOG_SEQ")
    @Column(name = "ID")
    private Long id;

    @Column(name = "CORRELATION_ID")
    private String correlationId;

    @Column(name = "ERROR_CODES")
    @ElementCollection
    private List<String> errorCodes;

    @Column(name = "CREATION_DATE_TIME")
    private Date creationTime;

    @Column(name = "XML")
    private String xmlData;

    @Column(name = "PUBLISH_DATE")
    private Date publishDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public List<String> getErrorCodes() {
        return errorCodes;
    }

    public void setErrorCodes(List<String> errorCodes) {
        this.errorCodes = errorCodes;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public String getXmlData() {
        return xmlData;
    }

    public void setXmlData(String xmlData) {
        this.xmlData = xmlData;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
}

package nl.tue.base.mq.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@ToString
@Getter
@Setter
@Entity
@Table(name = "MQ_REQUEST_LOG")
@SequenceGenerator(
        name = "MQ_REQUEST_LOG_SEQ",
        sequenceName = "MQ_REQUEST_LOG_SEQ",
        allocationSize = 1
)
public class MqRequestLog {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MQ_REQUEST_LOG_SEQ")
    @Column(name = "ID")
    private Long id;


    @Column(name = "MESSAGE_ID")
    private String messageId;


    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATION_DATE_TIME")
    private Date creationTime;

    @Lob
    @Column(name = "XML")
    private String xmlData;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
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
}

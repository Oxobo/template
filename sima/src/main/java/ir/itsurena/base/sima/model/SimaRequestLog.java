package ir.itsurena.base.sima.model;

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
@Table(name = "CB_SIMA_REQUEST_LOG")
@SequenceGenerator(
        name = "CB_SIMA_REQUEST_LOG_SEQ",
        sequenceName = "CB_SIMA_REQUEST_LOG_SEQ",
        allocationSize = 1
)
public class SimaRequestLog {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CB_SIMA_REQUEST_LOG_SEQ")
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


}

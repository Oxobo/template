package ir.itsurena.base.sima.model;


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
@Table(name = "CB_SIMA_RESPONSE_LOG")
@SequenceGenerator(
        name = "CB_SIMA_RESPONSE_LOG_SEQ",
        sequenceName = "CB_SIMA_RESPONSE_LOG_SEQ",
        allocationSize = 1
)
public class SimaResponseLog {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CB_SIMA_RESPONSE_LOG_SEQ")
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
}

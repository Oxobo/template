package nl.tue.base.baseinfo.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "T_COMMON_VALUE")
@SequenceGenerator(
        name = "SEQ_T_COMMON_VALUE",
        sequenceName = "SEQ_T_COMMON_VALUE",
        allocationSize = 1
)

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString

public class CommonValue extends AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_T_COMMON_VALUE")
    private long id;

    private String key;
    private String title;

    @Column(name="READ_ONLY")
    private boolean readOnly;

    @ManyToOne
    private CommonType commonType;
}

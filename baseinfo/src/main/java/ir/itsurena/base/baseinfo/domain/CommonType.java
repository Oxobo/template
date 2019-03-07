package ir.itsurena.base.baseinfo.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "T_COMMON_TYPE")
@SequenceGenerator(
        name = "SEQ_T_COMMON_TYPE",
        sequenceName = "SEQ_T_COMMON_TYPE",
        allocationSize = 1
)

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString

public class CommonType extends AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="SEQ_T_COMMON_TYPE")
    private long id;

    private String key;
    private String title;

    @OneToMany(mappedBy = "commonType")
    private List<CommonValue> commonValues;

}

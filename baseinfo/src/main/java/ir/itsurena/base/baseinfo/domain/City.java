package ir.itsurena.base.baseinfo.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "T_CITY")
@SequenceGenerator(
        name = "SEQ_T_CITY",
        sequenceName = "SEQ_T_CITY",
        allocationSize = 1
)

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString

public class City extends AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="SEQ_T_CITY")
    private long id;
    private String name;
    private String code;
    @ManyToOne
    private State state;
}

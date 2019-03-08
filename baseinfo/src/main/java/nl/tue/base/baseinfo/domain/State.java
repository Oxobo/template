package nl.tue.base.baseinfo.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "T_STATE")
@SequenceGenerator(
        name = "SEQ_T_STATE",
        sequenceName = "SEQ_T_STATE",
        allocationSize = 1
)

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString(exclude = "cities")

public class State extends AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="SEQ_T_STATE")
    private long id;
    private String name;
    private String code;

    @OneToMany(mappedBy = "state")
    private List<City> cities;

}


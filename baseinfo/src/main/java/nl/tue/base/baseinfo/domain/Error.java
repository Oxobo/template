package nl.tue.base.baseinfo.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "T_ERROR")
@SequenceGenerator(
        name = "SEQ_T_ERROR",
        sequenceName = "SEQ_T_ERROR",
        allocationSize = 1
)

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString

public class Error extends AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="SEQ_T_ERROR")
    private long id;

    private String code;
    private String description;
}

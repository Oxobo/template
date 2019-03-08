package nl.tue.base.baseinfo.domain;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "T_COUNTRY")
@SequenceGenerator(
        name = "SEQ_T_COUNTRY",
        sequenceName = "SEQ_T_COUNTRY",
        allocationSize = 1
)

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString

public class Country extends AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="SEQ_T_COUNTRY")
    private long id;

    private String title;

    @Column(name="ENGLISH_TITLE")
    private String englishTitle;

    @Column(name="BRIEF_TITLE")
    private String briefTitle;


}

package ir.itsurena.base.sima.config;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "CB_APPLICATION_CONFIG")
@SequenceGenerator(
        name = "CB_APPLICATION_CONFIG_SEQ",
        sequenceName = "CB_APPLICATION_CONFIG_SEQ",
        allocationSize = 1
)
public class ApplicationConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CB_APPLICATION_CONFIG_SEQ")
    @Column(name = "ID")
    private Integer id;

    @Column(name = "KEY")
    private String key;

    @Column(name = "VALUE")
    private String value;
}

package ir.itsurena.base.sima.config;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "CB_SERVICE_CONFIG")
@SequenceGenerator(
        name = "CB_SERVICE_CONFIG_SEQ",
        sequenceName = "CB_SERVICE_CONFIG_SEQ",
        allocationSize = 1
)
public class ServiceConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CB_SERVICE_CONFIG_SEQ")
    @Column(name = "ID")
    private Integer id;

    @Column(name = "CODE", nullable = false)
    private Integer code;

    @Column(name = "NAME", length = 128, nullable = false)
    private String name;

    @Column(name = "VALIDITY_TIME", nullable = false)
    private Long validityTime;

    @Column(name = "mandatory", nullable = false)
    private Boolean mandatory;
}

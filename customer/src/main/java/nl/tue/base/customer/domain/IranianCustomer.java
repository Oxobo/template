package nl.tue.base.customer.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.tue.base.core.domain.AbstractAuditingEntity;
import nl.tue.base.customerdto.dto.Gender;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@SequenceGenerator(
        name = "IranianCustomer_SEQ",
        sequenceName = "IranianCustomer_SEQ",
        allocationSize = 1
)
public class IranianCustomer extends AbstractAuditingEntity implements Serializable  {

    private static final long serialVersionUID = -842766372166407980L;

    @JsonProperty("id")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IranianCustomer_SEQ")
    private long id ;
    private String nationalId ;
    private String idNumber ;
    private LocalDate birthDate ;
    private String firstName ;
    private String lastName ;
    private String fatherName ;
    private String birthPlace ;
    private Gender gender ;
    private String stockTradingCode ;
    private String isoName ;
    private String phoneNumber ;
    private String phone ;
    private String code ;
    private String zipCode ;
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Address address;
    private String plainAddress ;

 
 





  

 
 
}

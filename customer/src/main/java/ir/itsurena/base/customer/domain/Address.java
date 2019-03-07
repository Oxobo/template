package ir.itsurena.base.customer.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "ADDRESS")
@SequenceGenerator(
        name = "Address_SEQ",
        sequenceName = "Address_SEQ",
        allocationSize = 1
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString(exclude ="iranianCustomers" )
public class Address implements Serializable {


    private static final long serialVersionUID = 2327637548048595930L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="Address_SEQ")
    private long id;
    private String province;
    private String city;

    public Address(String province, String city) {
        this.province = province;
        this.city = city;
    }

    @OneToMany(mappedBy = "address" , fetch = FetchType.EAGER )
    private List<IranianCustomer> iranianCustomers;



}

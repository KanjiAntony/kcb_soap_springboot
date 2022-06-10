package ke.co.kanji.kcb.customers.entity;

import ke.co.kanji.kcb.customers.CustomerGender;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "ken21083_customer")
@Data
public class Customer {

    @Id
    @SequenceGenerator(
            name="ken21083_customer_sequence",
            sequenceName = "ken21083_customer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "ken21083_customer_sequence"
    )
    private long customerId;

    @Column(nullable = false)
    private String customerName;

    @Column(nullable = false)
    private int customerPhone;

    @Column(nullable = false)
    private String customerEmail;

    @Enumerated(value = EnumType.STRING)
    private CustomerGender customerGender;

}

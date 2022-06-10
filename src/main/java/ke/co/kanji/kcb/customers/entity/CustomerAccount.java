package ke.co.kanji.kcb.customers.entity;

import ke.co.kanji.kcb.customers.AccountType;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name ="ken21083_customer_account")
@Data
public class CustomerAccount {

    @Id
    @SequenceGenerator(
            name="ken21083_customer_account_sequence",
            sequenceName = "ken21083_customer_account_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "ken21083_customer_account_sequence"
    )
    private long accountId;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private AccountType accountType;

    @Column(nullable = false)
    private long accountNumber;

    @ManyToOne
    @JoinColumn(name = "customerId",nullable = false)
    private Customer customer;

}

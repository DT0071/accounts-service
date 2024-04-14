package com.dtcodes.accounts.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @ToString
public class Account extends BaseEntity{


    @Column(name = "customer_id")//Not required
    private Long customerId;

    @Id
    private Long accountNumber;
    private String accountType;
    private String branchAddress;
}

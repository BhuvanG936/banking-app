package com.srsvmj.banking.entity;

import jakarta.persistence.*;
import lombok.*;


@Table(name="accounts")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Account {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(name="account_holder_name")
    private String accountHolderName;
    private double balance;
}

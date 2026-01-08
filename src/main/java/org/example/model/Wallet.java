package org.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "wallet")
public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name")
    private String userName;

    private Double balance;

    public Wallet() {
    }

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}


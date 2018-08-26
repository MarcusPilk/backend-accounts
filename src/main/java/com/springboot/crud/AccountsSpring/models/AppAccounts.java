package com.springboot.crud.AccountsSpring.models;

import javax.persistence.*;

@Entity
@Table(name = "tb_accounts")
public class AppAccounts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "account_id")
    public int account_id;
    @Column (name ="first_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;
    @Column(name = "account_number")
    private int account_number;

    public AppAccounts() {
    }

    public AppAccounts(String first_name, String last_name, int account_number) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.account_number = account_number;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }
}

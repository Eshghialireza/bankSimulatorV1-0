package com.bankSimulator.base;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class BaseDomain<ID extends Serializable> implements Serializable{
    @Id
    @GeneratedValue
    private ID id;

    public BaseDomain(ID id) {
        this.id = id;
    }

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    public BaseDomain() {
    }
}

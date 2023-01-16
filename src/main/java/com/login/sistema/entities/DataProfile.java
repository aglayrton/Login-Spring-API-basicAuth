package com.login.sistema.entities;

import com.login.sistema.dto.DataProfileDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "data_profile")
public class DataProfile extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uid;
    @Column
    private String name;
    @Column
    private String document;
    @Column
    private String email;
    @Column
    private String phoneNumber;

    public DataProfile(DataProfileDto dataProfile) {
        this.email = dataProfile.getEmail();
        this.document = dataProfile.getDocument();
        this.phoneNumber = dataProfile.getPhoneNumber();
        this.name = dataProfile.getName();
    }

    public UUID getUid() {
        return uid;
    }

    public void setUid(UUID uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}

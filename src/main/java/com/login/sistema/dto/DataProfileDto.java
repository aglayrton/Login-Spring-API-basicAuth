package com.login.sistema.dto;

import com.login.sistema.entities.DataProfile;

import java.util.UUID;

public class DataProfileDto {

    private UUID uid;
    private String name;
    private String document;
    private String email;
    private String phoneNumber;

    public DataProfileDto(DataProfile dataProfile) {
        this.uid = dataProfile.getUid();
        this.document = dataProfile.getDocument();;
        this.email = dataProfile.getEmail();
        this.phoneNumber = dataProfile.getPhoneNumber();
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

    public DataProfileDto(UUID uid, String name, String document, String email, String phoneNumber) {
        this.uid = uid;
        this.name = name;
        this.document = document;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public DataProfileDto() {
    }
}

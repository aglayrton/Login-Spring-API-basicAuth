package com.login.sistema.entities;

import java.util.UUID;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Role {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID uid;
  private String name;
  private Integer type;
  private Boolean enable_boot;

  public Role(UUID uid, String name, Integer type, Boolean enable_boot) {
    this.uid = uid;
    this.name = name;
    this.type = type;
    this.enable_boot = enable_boot;
  }

  public Role() {
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

  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public Boolean getEnable_boot() {
    return enable_boot;
  }

  public void setEnable_boot(Boolean enable_boot) {
    this.enable_boot = enable_boot;
  }

}

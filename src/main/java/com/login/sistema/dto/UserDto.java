package com.login.sistema.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.util.Objects;
import java.util.UUID;


public class UserDto {
  private UUID uid;
  @Email
  private String email;

  @NotBlank
  private String password;
  private Boolean enableBoot;
  private DataProfileDto dataProfile;


  public UserDto() {
  }

  public UserDto(UUID uid, String email, String password, Boolean enableBoot) {
    this.uid = uid;
    this.email = email;
    this.password = password;
    this.enableBoot = enableBoot;
  }

  public UUID getUid() {
    return uid;
  }

  public void setUid(UUID uid) {
    this.uid = uid;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Boolean getEnableBoot() {
    return enableBoot;
  }

  public void setEnableBoot(Boolean enableBoot) {
    this.enableBoot = enableBoot;
  }

  public DataProfileDto getDataProfile() {
    return dataProfile;
  }

  public void setDataProfile(DataProfileDto dataProfile) {
    this.dataProfile = dataProfile;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UserDto userDto = (UserDto) o;
    return uid.equals(userDto.uid) && email.equals(userDto.email) && password.equals(userDto.password) && enableBoot.equals(userDto.enableBoot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, email, password, enableBoot);
  }
}

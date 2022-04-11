package com.japcdev.springboot.app.springbootweb.models;

public class User {
  private String name;
  private String surname;
  private String email;

  public User() {
  }

  public User(String name, String surname, String email) {
    this.name = name;
    this.surname = surname;
    this.email = email;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }
  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }
  /**
   * @return the surname
   */
  public String getSurname() {
    return surname;
  }
  /**
   * @param surname the surname to set
   */
  public void setSurname(String surname) {
    this.surname = surname;
  }
}

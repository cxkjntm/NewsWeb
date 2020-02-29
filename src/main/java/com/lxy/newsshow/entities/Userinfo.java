package com.lxy.newsshow.entities;


public class Userinfo {

  private long id;
  private String userName;
  private String userPassword;
  private long age;
  private String gender;
  private String telephone;
  private String address;

  public Userinfo(String userName, String userPassword, long age, String gender, String telephone, String address){
    this.userName = userName;
    this.userPassword =userPassword;
    this.age = age;
    this.gender = gender;
    this.telephone = telephone;
    this.address = address;
  }
  Userinfo(){}
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }


  public long getAge() {
    return age;
  }

  public void setAge(long age) {
    this.age = age;
  }


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

}

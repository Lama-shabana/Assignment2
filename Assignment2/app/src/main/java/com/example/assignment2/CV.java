package com.example.assignment2;

import java.util.Date;

public class CV {

    private String fullName;
    private String email;
    private String gender;
    private String phone;
    private String age;
    private Date dateOfBirth;
    private String Password;
    private String hobbies;

    public CV(){}
    public CV(String fullName, String email, String gender, String phone, String age, Date dateOfBirth, String Password,String hobbies){
        this.fullName = fullName;
      this.age=age;
      this.email=email;
      this.dateOfBirth=dateOfBirth;
      this.gender=gender;
      this.phone=phone;
      this.hobbies=hobbies;
      this.Password=Password;

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }
}


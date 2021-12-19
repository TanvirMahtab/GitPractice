package com.example.gitpractice.model;

public class Student {
    private int id;
    private String name;
    private String gender;
    private String email;
    private String dateOfBirth;
    private String mobileNumber;
    private int age;

    public Student(int id,
                   String name,
                   String gender,
                   String email,
                   String dateOfBirth,
                   String mobileNumber,
                   int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.mobileNumber = mobileNumber;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    
    public int getAge(int age){
        return age;
    }
    
    public void setAge(int age){
        this.age = age ;
    }
    
}

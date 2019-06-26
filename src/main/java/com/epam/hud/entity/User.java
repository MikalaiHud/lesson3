package com.epam.hud.entity;

public class User {
    private String name;
    private String surname;
    private int age;
    private String email;
    private double loanPayment;
    private double loanRest;
    private double loanPercent;
    private int loanDays;
    private double taxPayment;
    private double taxRest;

    public User(String name, String surname, int age, String email, double loanPayment, double loanRest, double loanPercent, int loanDays, double taxPayment, double taxRest) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.loanPayment = loanPayment;
        this.loanRest = loanRest;
        this.loanPercent = loanPercent;
        this.loanDays = loanDays;
        this.taxPayment = taxPayment;
        this.taxRest = taxRest;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getLoanPayment() {
        return loanPayment;
    }

    public void setLoanPayment(double loanPayment) {
        this.loanPayment = loanPayment;
    }

    public double getLoanRest() {
        return loanRest;
    }

    public void setLoanRest(double loanRest) {
        this.loanRest = loanRest;
    }

    public double getLoanPercent() {
        return loanPercent;
    }

    public void setLoanPercent(double loanPercent) {
        this.loanPercent = loanPercent;
    }

    public int getLoanDays() {
        return loanDays;
    }

    public void setLoanDays(int loanDays) {
        this.loanDays = loanDays;
    }

    public double getTaxPayment() {
        return taxPayment;
    }

    public void setTaxPayment(double taxPayment) {
        this.taxPayment = taxPayment;
    }

    public double getTaxRest() {
        return taxRest;
    }

    public void setTaxRest(double taxRest) {
        this.taxRest = taxRest;
    }


}

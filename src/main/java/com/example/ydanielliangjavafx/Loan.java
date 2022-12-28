package com.example.ydanielliangjavafx;

import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;


    public Loan(double interest, int year, double loanAmount) {
        this.annualInterestRate = interest;
        this.numberOfYears = year;
        this.loanAmount = loanAmount;
        this.loanDate= new Date();
    }

    public Loan(){
        this(2.5,1,100);
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment() {
         double monthlyInterestRate = annualInterestRate / 1200;
        double v = 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
        return  loanAmount * monthlyInterestRate / (1 -v);

         }

    public double getTotalPayment() {
         double totalPayment = getMonthlyPayment() * numberOfYears * 12;
         return totalPayment;
         }
         /** Return loan date */
         public java.util.Date getLoanDate() {
         return loanDate;
         }
}

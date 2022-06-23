package ua.com.javacertificateoracle.lesson4;

public class BankAccount {
    private int accountId;
    private String name;
    private String sureName;
    private int accountBalance;
    public BankAccount(
            int accountId,
            String name,
            String sureName,
            int accountBalance){
        this.accountId = accountId;
        this.name = name;
        this.sureName = sureName;
        this.accountBalance = accountBalance;
    }
    public int balanceFunding(int balanceFunding){
        return accountBalance += balanceFunding;
    }
    public int withdrawal( int withdrawal){
        return accountBalance -=withdrawal;
    }
    public void info(){
        System.out.println("accountId= " + accountId + "\n" +
                            "name= '" + name + "'" + "\n" +
                            "sure name= '" + sureName + "'" + "\n" +
                            "account balance= " + accountBalance + "\n");
    }
}

package com.cohortFive.tdd;

public class Account {
    private int accountBalance;
    public void depositAmount(int cashAmount) {
        if(cashAmount>=0){
        accountBalance+=cashAmount;
        }

    }

    public int getAccountBalance(){
        return accountBalance;

    }

    public void withdrawAmount(int cashAmount) {
        if (accountBalance<cashAmount)
        {System.out.println("You have insufficient fund"); }
        if (accountBalance>=cashAmount)
        {accountBalance-=cashAmount;}
    }


}

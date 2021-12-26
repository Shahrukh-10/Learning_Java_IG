package com.ingenuity.threadSynchronization;

public class Account {
    private int balance;
    private int accId;
    public Account(int accId){
        this.accId = accId;
    }

//    IF WE DONT USE SYNCHRONIZED THEN BOTH THREADS WILL BE ABLE TO WITHDRAW MONEY MAKING ACCOUNT TO GO TO NEGATIVE
//    BUT IF WE USE SYNCHRONIZED THEN AFTER FIRST THREAD WILL MAKE TRANSACTION THEN THE AMT WILL BE UPDATED BEFORE USED BY OTHER
    public synchronized boolean withdrawl(int amt){
        boolean retVal = false;
        if(balance>amt){
            try {
                Thread.sleep(600);
            }catch (Exception e){
                e.printStackTrace();
            }
            balance = balance-amt;
            setBalance(balance);
            System.out.println("Balance after witdrawl : "+balance);
            retVal = true;
        }
        return retVal;
    }
    public int getBalance(){
        return balance;
    }
    public void setBalance(int val){
        this.balance = val;
    }
}

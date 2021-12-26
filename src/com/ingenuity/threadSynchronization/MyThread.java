package com.ingenuity.threadSynchronization;

public class MyThread implements Runnable{
    Account acct;
    int withrawlAmt = 0;
    public MyThread(Account acct,int withrawlAmt){
        this.acct = acct;
        this.withrawlAmt = withrawlAmt;
    }

    @Override
    public void run() {
        boolean isSuccess = acct.withdrawl(withrawlAmt);
        System.out.println("Withdrawl success for : "+Thread.currentThread().getName()+" : "+isSuccess);
    }
}

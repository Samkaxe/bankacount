package Acounts;

public class Acount {
    protected double balance ;
    private double intrensRate ;

    public Acount(double balance, double intrensRate) {
        this.balance = balance;
        this.intrensRate = intrensRate;
    }
    public boolean withdraw(double amount){

        if(amount > balance){

            return false ;
        }
        balance -= amount ;
        return true;
    }
    public void deposit(double amount){
       balance += amount ;

    }

    public double getBalance() {
        return balance;
    }

    public double getIntrensRate() {
        return intrensRate;
    }
    public void status(){
        System.out.println("Balance is " + balance);
    }
}

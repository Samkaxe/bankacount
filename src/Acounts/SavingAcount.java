package Acounts;

public class SavingAcount extends Acount {
    public SavingAcount(double balance, double intrensRate) {
        super(balance, intrensRate);
    }

    @Override
    public boolean withdraw(double amount){

        double fee = 0.025 * amount;
        amount += fee ;

       return super.withdraw(amount);


    }

}

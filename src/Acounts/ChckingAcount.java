package Acounts;

public class ChckingAcount extends Acount {
    public int rewardpoints ;


    public ChckingAcount(double balance, double intrensRate , int rewardpoints) {
        super(balance, intrensRate);
        this.rewardpoints = rewardpoints;
    }
    public boolean purchase(double cost){
        if(cost > balance){

            return false ;
        }
        balance -= cost ;
        rewardpoints += calculateRewardPoints(cost);
        return true ;

    }
    public int calculateRewardPoints(double cost){

        return (int) (cost* 10 );
    }

    public int getRewardpoints() {
        return rewardpoints;
    }
}

package Acounts;

public class SilverCheckingAcount extends ChckingAcount{

    public SilverCheckingAcount(double balance, double intrensRate, int rewardpoints) {
        super(balance, intrensRate, rewardpoints);
    }

    @Override
    public int calculateRewardPoints(double cost) {
        return (int) (cost * 25);
    }
}

package Acounts;

public class GoldCheckingAcount extends ChckingAcount{
    public GoldCheckingAcount(double balance, double intrensRate, int rewardpoints) {
        super(balance, intrensRate, rewardpoints);
    }

    @Override
    public int calculateRewardPoints(double cost) {
        return (int) (Math.min(cost , 4000)* 50);
    }
}

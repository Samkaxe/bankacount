import Acounts.*;

public class Main {

    public static void main(String[] args) {
        ChckingAcount ca = new ChckingAcount(100 ,0.037 , 500);
        SavingAcount sa = new SavingAcount(100 , 0.045);

        SilverCheckingAcount silver = new SilverCheckingAcount(5000 ,0.025 , 1000);
        GoldCheckingAcount   gold = new GoldCheckingAcount(5000 ,0.025 , 1000);
        DiamindCheckingAcount diamond = new DiamindCheckingAcount(5000 ,0.025 , 1000 );

        System.out.println(silver.rewardpoints);
        System.out.println(gold.rewardpoints);
        System.out.println(diamond.rewardpoints);

        silver.purchase(50);
        gold.purchase(50);
        diamond.purchase(50);

        System.out.println(silver.rewardpoints);
        System.out.println(gold.rewardpoints);
        System.out.println(diamond.rewardpoints);
    }
}

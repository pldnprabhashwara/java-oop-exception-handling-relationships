package oop16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DiscountManager manager = new DiscountManager();
        SeasonalDiscount sd1 = new SeasonalDiscount("nayana");
        SeasonalDiscount sd2 = new SeasonalDiscount("np");


        LoyaltyDiscount ld1 = new LoyaltyDiscount("janidu", 5);
        LoyaltyDiscount ld2 = new LoyaltyDiscount("janid", 6);

        manager.addDiscount(sd1);
        manager.addDiscount(sd2);

        manager.addDiscount(ld1);
        manager.addDiscount(ld2);

        manager.applyAll(2000.00);

        System.out.println("\n");
        System.out.println("Total Discounts Applied: " + DiscountManager.getTotalDiscountsApplied());

    }
}

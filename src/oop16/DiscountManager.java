package oop16;
import java.util.ArrayList;

public class DiscountManager {

    private static int totalDiscountsApplied = 0;

    private ArrayList<Discountable> discountList= new ArrayList<>();


    public void addDiscount(Discountable d){
        discountList.add(d);
    }


    public void applyAll(double originalPrice){

        for(Discountable d:discountList){
            double discountPrice = d.applyDiscount(originalPrice);

            System.out.println(" ");
            System.out.println("Discount price is "+discountPrice);

            totalDiscountsApplied++;
        }

    }

    public static int getTotalDiscountsApplied() {
        return totalDiscountsApplied;
    }
}

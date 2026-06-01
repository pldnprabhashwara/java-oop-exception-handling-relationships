package oop16;

public class LoyaltyDiscount implements Discountable{

    private String name;
    private int loyaltyYears;

    public LoyaltyDiscount(String name, int loyaltyYears){
        this.name = name;
        this.loyaltyYears = loyaltyYears;
    }

    @Override
    public double applyDiscount(double price) {

        int discount = loyaltyYears * 5;

        if (discount > MAX_DISCOUNT) {

            discount = MAX_DISCOUNT;
        }

        return price - (price * discount / 100);
    }
}

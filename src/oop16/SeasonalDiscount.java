package oop16;

public class SeasonalDiscount implements Discountable{
    private String name;

    public SeasonalDiscount(String name){
        this.name = name;
    }

    @Override
    public double applyDiscount(double price) {
        return price-(price * 20/100);
    }

    public String getName() {
        return name;
    }
}

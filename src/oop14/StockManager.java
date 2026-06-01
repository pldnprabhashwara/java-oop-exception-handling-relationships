package oop14;

public class StockManager {

    public void requestStock(int available, int requested)
        throws OutOfStockException, NegativeQuantityException{
        if(available < requested){
            throw new OutOfStockException("Insufficient stock. Available: " + (available));
        }

        if(requested <= 0){
            throw new NegativeQuantityException("Quantity must be a positive number.");
        }

        System.out.println(" product stock management system is successful");
    }
}

package oop14;
import java.util.Scanner;

public class StockApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StockManager sm = new StockManager();

        int available = 600;

        System.out.print("Enter your requested stocks: ");
        int requested =  input.nextInt();
        try{
            try{
                if(requested > available){
                    throw new OutOfStockException("Out of Stock.");
                }
            }catch(OutOfStockException e){
                System.out.println(e.getMessage());
            }
            sm.requestStock(available, requested);
        }catch(NegativeQuantityException e){
            System.out.println("negative number error: " + e.getMessage());
        }catch(OutOfStockException e){
            System.out.println("out of stock error: " + e.getMessage());
        }finally{
            System.out.println("Stock request processed.");
        }

    }
}

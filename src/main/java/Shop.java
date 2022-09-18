import java.util.ArrayList;
import java.util.Optional;

public class Shop {
    public Shop(String name, ArrayList<ISell> stock, double balance) {
        this.name = name;
        this.stock = stock;
        this.balance = balance;
    }

    private String name;
    private ArrayList<ISell> stock;
    private double balance;


    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public double getBalance() {
        return balance;
    }


    public void fillStock(ArrayList<ISell> items){
        for (ISell item : items) {
            if(item instanceof Instrument && this.balance - ((Instrument) item).getStockPrice() > 0) {
                this.stock.add(item);
                this.balance -= (((Instrument) item).getStockPrice());
            }
        }
    }


    public double calcMarkup(){
        double totalMarkup = stock.stream().map(ISell::itemMarkUp).reduce(Double::sum).get();
        return totalMarkup;
    }

}

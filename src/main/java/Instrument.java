public abstract class Instrument implements IPLay , ISell{

    private String name;
    private InstrumentType type;
    private double stockPrice;
    private double salePrice;

    public Instrument(String name, InstrumentType type, double stockPrice, double salePrice){
        this.name = name;
        this.type = type;
        this.stockPrice = stockPrice;
        this.salePrice =salePrice;
    }

    public String getName() {
        return name;
    }

    public InstrumentType getType() {
        return type;
    }

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getStockPrice() {
        return stockPrice;
    }

    public double getSalePrice() {
        return salePrice;
    }


    public String play(){
        return String.format("%s noise", getName());
    }

    public double itemMarkUp(){
        return salePrice - stockPrice;
    }
}

public class Stringed extends Instrument {


    private int noOfStrings;

    public Stringed(String name, double stockPrice, double salePrice, int noOfStrings) {
        super(name,InstrumentType.STRING, stockPrice, salePrice);
        this.noOfStrings = noOfStrings;
        }





    public int getNoOfStrings() {
        return noOfStrings;
    }
}

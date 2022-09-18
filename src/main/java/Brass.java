public class Brass extends Instrument {

    private  int noOfvalves;


    public Brass(String name, double stockPrice, double salePrice, int noOfvalves) {
        super(name, InstrumentType.BRASS, stockPrice, salePrice);
        this.noOfvalves = noOfvalves;
    }

    public int getNoOfvalves() {
        return noOfvalves;
    }
}

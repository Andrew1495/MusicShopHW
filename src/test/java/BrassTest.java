import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BrassTest {

    Brass trumpet;

    @Before
    public void setUp() throws Exception {
        trumpet = new Brass("trumpet",100.00, 150.00,3);
    }

    @Test
    public void getName() {
        assertEquals("trumpet", trumpet.getName());
    }

    @Test
    public void getType() {
        assertEquals(InstrumentType.BRASS, trumpet.getType());
    }

    @Test
    public void setStockPrice() {
        trumpet.setStockPrice(2.00);
        assertEquals(2.00 , trumpet.getStockPrice(), 0.00);
    }

    @Test
    public void setSalePrice() {
        trumpet.setSalePrice(4.00);
        assertEquals(4.00, trumpet.getSalePrice(), 0.0);
    }


    @Test
    public void play() {
        assertEquals("trumpet noise", trumpet.play());
    }

    @Test
    public void getNoOfvalves() {
        assertEquals(3, trumpet.getNoOfvalves());
    }

    @Test
    public void hasMarkUp(){
        assertEquals(50.00, trumpet.itemMarkUp(), 0.0);
    }
}
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShopTest {

    Stringed guitar;
    Brass trumpet1;
    Brass trumpet2;
    Shop shop;

    @Before
    public void setUp() throws Exception {
        trumpet1 = new Brass("new trumpet", 500.00, 800.00, 3);
        trumpet2 = new Brass("old trumpet", 200.00, 500.00, 3);
        guitar = new Stringed("guitar", 300.00, 600.00, 4);
        shop = new Shop("the shop", new ArrayList<ISell> (), 1500.00);
        ArrayList <ISell> stock = new ArrayList<ISell> ();
        stock.add(trumpet1);
        stock.add(trumpet2);
        stock.add(guitar);
        shop.fillStock(stock);
    }

    @Test
    public void getName() {
        assertEquals("the shop", shop.getName());
    }

    @Test
    public void getStock() {
        assertEquals(3, shop.getStock().size());
        assertEquals(300.00, shop.getStock().get(0).itemMarkUp(),0.00);
    }

    @Test
    public void getBalance() {
        assertEquals(500.00, shop.getBalance(),0.0);
    }

    @Test
    public void calcMarkup() {
        assertEquals(900.00, shop.calcMarkup(),0.0);
    }
}
import org.junit.Test;

import static org.junit.Assert.*;

public class BinsTest {

    @Test
    public void testGetBin() {
        //given
        Bins bin1 = new Bins(2);
        int expected = 1;
        //when
        bin1.incrementBin(3);
        int actual = bin1.getTimesValueThrown(3);
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testGetBinLoop() {
        //given
        Bins bin2 = new Bins(2);
        int expected = 101;
        //when
        for(int i=0; i<101; i++) {
            bin2.incrementBin(10);
        }
        int actual = bin2.getTimesValueThrown(10);
        //then
        assertEquals(expected, actual);
    }

    @Test
    public void testGetBinTotal() {
        //given
        Bins bin2 = new Bins(2);
        int expected = 202;
        //when
        for(int i=0; i<101; i++) {
            bin2.incrementBin(10);
            bin2.incrementBin(5);
        }
        int actual = bin2.getBinTotal();
        //then
        assertEquals(expected, actual);
    }
}
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DiceTest {
    @Test
    public void rollOneDieTest(){
        // Given
        Dice dice = new Dice(1);

        // When
        int dieRoll = dice.tossAndSum();

        // Then
        assertTrue(dieRoll <= 6 && dieRoll >= 1);
    }

    @Test
    public void rollTwoDiceTest(){
        // Given
        Dice dice = new Dice(2);

        // When
        int rollTwo = dice.tossAndSum();

        // Then
        Assert.assertTrue(rollTwo <= 12 && rollTwo >= 2);
    }
}
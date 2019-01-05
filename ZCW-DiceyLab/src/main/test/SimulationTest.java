import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimulationTest {


    @Test
    public void runSimTest(){
        //given
    Simulation sim = new Simulation(2,100);
    int expected = 100;
        //when
    sim.runSimulation();
    int actual = sim.getBin().getBinTotal();
        //them
        Assert.assertEquals(expected,actual);
    }


}
import java.util.Formatter;

public class Simulation {

    private int diceNum;
    private int tossNum;
    private Dice dice = new Dice(diceNum);
    private Bins bin = new Bins(diceNum);

    public Simulation(int diceNum, int tossNum){
        this.diceNum = diceNum;
        this.tossNum = tossNum;
}

    public void runSimulation(){
        for(int i=0; i<tossNum; i++){
            bin.incrementBin(dice.tossAndSum());
        }
}

    public Bins getBin(){
        return bin;
    }

    public String printSimulation() {
        runSimulation();
        StringBuilder result = new StringBuilder();
        Formatter format = new Formatter(result);

        result.append("***\n Simulation of ");
        result.append(diceNum);
        result.append(" dice tossed for ");
        result.append(tossNum);
        result.append(" times.\n*** \n \n");
        for (int i=0; i<((diceNum*6)-(diceNum)+1); i++) {
            int numTimesThrown = bin.getTimesValueThrown(i+diceNum);
            format.format("%2d", i+diceNum);
            result.append(" : ");
            format.format("%10d", bin.getTimesValueThrown(i+diceNum));
            result.append(": ");
            format.format("%.2f", (double)numTimesThrown/(double)tossNum);
             for(int j=0; j<(((double)numTimesThrown/(double)tossNum)*100); j++){

                 {result.append(" *");}
             }
            result.append("\n");

        }
        String printAns = result.toString();
        return printAns;
    }



}

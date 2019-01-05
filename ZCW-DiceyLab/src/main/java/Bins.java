
public class Bins {

    private int diceNum;
    private int[] trackedDiceValues;  //array to track total number of times a toss totals a given value

    public Bins(int diceNum) {
        this.diceNum = diceNum;
        this.trackedDiceValues = new int[(diceNum * 6) - (diceNum)+1];;
    }


    public void incrementBin(int binNumber) {
        trackedDiceValues[binNumber-diceNum]=(trackedDiceValues[binNumber-diceNum])+1;
    }

    public int getTimesValueThrown(int binNumber) {
        int timesValueThrown = trackedDiceValues[(binNumber-diceNum)];
        return timesValueThrown;

    }

    public int getBinTotal(){
        int binTotal = 0;
        for (int binValue : trackedDiceValues) {
            binTotal+=binValue;
        }
        return binTotal;
    }
}

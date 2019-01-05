public class Dice {
    private int numDiceRolled;

    public Dice(int numOfDice){
        numDiceRolled = numOfDice;
    }

    public int tossAndSum(){
        int toss = 0;
        for (int i = 0; i < numDiceRolled; i++) {
            toss += (int) (Math.ceil(Math.random() * 6));
        }
        return toss;
    }

}
public class Main {

    public static void main(String[] args) {

        Simulation sim = new Simulation(2, 1000000);
        sim.runSimulation();
        System.out.println(sim.printSimulation());
    }

}

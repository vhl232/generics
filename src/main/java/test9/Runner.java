package test9;

public class Runner extends Thread {
    private String name;
    private int number;
    private double speed;

    public double getDistance() {
        return distance;
    }

    private double distance;

    public Runner(String name, int number, double speed) {
        this.name = name;
        this.number = number;
        this.speed = speed;

        this.distance = 0;
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            try {
                Thread.sleep(1000);
                distance += speed;
            } catch (InterruptedException e) {
                break;  // looks like someone asked this thread to stop
            }
        }
    }

    @Override
    public String toString() {

        return String.format("Runner %s(%d) run %.3f meters.", name, number, distance);
    }
}

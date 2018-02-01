import robocode.Robot;
import robocode.ScannedRobotEvent;

public class Squarebot extends Robot {
    public void run() {
        while (true) {
            turnLeft(100);
            ahead(50);
            turnGunLeft(10);
        }
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        fire(5.0);
    }
}
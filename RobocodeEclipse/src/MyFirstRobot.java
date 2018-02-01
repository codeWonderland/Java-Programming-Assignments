import robocode.Robot;
import robocode.ScannedRobotEvent;

public class MyFirstRobot extends Robot {
    public void run() {
        while (true) {
            turnLeft(100);
            ahead(10);
            fire(2);
        }
    }
}
import robocode.Robot;
import robocode.ScannedRobotEvent;

public class Scanbot extends Robot{
    public void run() {
        while(true) {
            turnLeft(10);
            ahead(50);
        }
    }
    public void onScannedRobot(ScannedRobotEvent e) {
        fire(5.0);
    }
}

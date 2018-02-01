import robocode.*;

public class TryNotToDie extends Robot {

    public void run() {
        while(true) {
            back(200);
            turnLeft(10);
            ahead(250);
            turnGunLeft(360);
        }
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        fire(5.0);
    }

    public void onHitByBullet(HitByBulletEvent e){
        if(getEnergy() < 150){
            turnRight(-e.getBearing());
            ahead(150);
        }
        else
            turnRight(360); // scan
    }

    public void onHitRobot(HitRobotEvent e) {
        turnRight(-e.getBearing());
        ahead(150);
    }

    public void onHitWall(HitWallEvent e) {
        turnRight(-e.getBearing());
        ahead(150);
    }

    public void onWin(WinEvent e) {
        while(true) {
            turnRight(40);
            turnLeft(40);
        }
    }
}

package me.codewonderland.robocodeproject;

import robocode.Robot;

public class MyFirstRobot extends Robot {
    public void run() {
        while (true) {
            turnLeft(100);
            ahead(10);
            fire(2);
        }
    }
}


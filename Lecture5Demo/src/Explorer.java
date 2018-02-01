public class Explorer {
    
    private int health = 10;
    private int distance = 0;
    
    public void move() {
        // TODO: Move the explorer
    }
    
    public void sleep() {
        // TODO: Heal some HP
    }
    
    public void hit(int n) {
        // TODO: Take n points of damage
    }
    
    public void attack(Beast beast) {
        // TODO: Attack the beast and take damage
    }
    
    public int getHealth() {
        return health;
    }

    public void setHealth(int newHealth) {
        health = newHealth;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int newDistance) {
        distance = newDistance;
    }

}

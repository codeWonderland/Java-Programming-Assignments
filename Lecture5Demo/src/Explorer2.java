public class Explorer2 {
    
    private int health = 10;
    private int distance = 0;
    
    public void move() {
        distance = distance + 1;
    }
    
    public void sleep() {
        health = health + 5;
    }
    
    public void hit(int n) {
        health = health - n;
    }
    
    public void attack(Beast2 beast) {
        hit(1);
        beast.hit(1);
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

public class Beast2 {
    
    private int health;

    public int getHealth() {
        return health;
    }

    public void setHealth(int newHealth) {
        health = newHealth;
    }

    public void hit(int n) {
        health = health - n;
    }

}

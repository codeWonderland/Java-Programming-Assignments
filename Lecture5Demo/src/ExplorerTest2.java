import static org.junit.Assert.*;

import org.junit.Test;

public class ExplorerTest2 {

    @Test
    public void testMove() {
        Explorer2 explorer = new Explorer2();
        
        explorer.setDistance(0);
        explorer.move();
        
        assertTrue(explorer.getDistance() == 1);
    }

    @Test
    public void testHit() {
        Explorer2 explorer = new Explorer2();
        
        explorer.setHealth(10);
        explorer.hit(4);
        
        assertTrue(explorer.getHealth() == 6);
    }
    
    @Test
    public void testAttack() {
        Explorer2 explorer = new Explorer2();
        Beast2 beast = new Beast2();
        
        explorer.setHealth(10);
        beast.setHealth(4);
        explorer.attack(beast);
        
        assertTrue(explorer.getHealth() == 9);
        assertTrue(beast.getHealth() == 3);
    }

    @Test
    public void testSleep() {
        Explorer2 explorer = new Explorer2();
        
        explorer.setHealth(10);
        explorer.sleep();
        
        assertTrue(explorer.getHealth() == 15);
    }
    
}

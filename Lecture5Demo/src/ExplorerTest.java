import static org.junit.Assert.*;

import org.junit.Test;

public class ExplorerTest {

    @Test
    public void testMove() {
        Explorer explorer = new Explorer();
        
        explorer.setDistance(0);
        explorer.move();
        
        assertTrue(explorer.getDistance() == 1);
    }
    
    @Test
    public void testSleep() {
        Explorer explorer = new Explorer();
        
        explorer.setHealth(10);
        explorer.sleep();
        
        assertTrue(explorer.getHealth() == 15);
    }
    
}

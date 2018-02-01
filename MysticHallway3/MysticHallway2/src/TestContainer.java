import static org.junit.Assert.*;

import org.junit.Test;

public class TestContainer {
    
    @Test
    public void testDefault() {
        // Create a new container
        Container container = new Container();
        
        // By default, it should be closed
        assertFalse(container.isOpen());
    }
    
    @Test
    public void testEmpty() {
        // Create a new container
        Container container = new Container();
        
        // It should be empty
        assertTrue(container.isEmpty());
    }
    
    @Test
    public void testFull() {
        // Create a new container and item
        Container container = new Container();
        Item figurine = new Item();

        // Put the figurine into the container
        container.setContents(figurine);

        // The container should now be full (not empty)
        assertFalse(container.isEmpty());
    }
    
    @Test
    public void testInteract() {
        // Create a new container
        Container container = new Container();
        
        // Then, interact with it (open it)
        container.interact();
        
        // Now, the container should be open
        assertTrue(container.isOpen());
    }
    
    @Test
    public void testClosedDescription() {
        // Create a new container
        Container container = new Container();

        // Set its description to be "chest"
        container.setDescription("chest");
        
        // It starts closed, so its description should be "closed chest"
        assertEquals("closed chest", container.getDescription());
    }

    @Test
    public void testEmptyDescription() {
        // Create a new container
        Container container = new Container();

        // Set its description to be "chest"
        container.setDescription("chest");
        
        // Open the container
        container.interact();
        
        // It's empty, so should say "empty chest"
        assertEquals("empty chest", container.getDescription());
    }
    
    @Test
    public void testFullDescription() {
        // Create a new container and figurine
        Container container = new Container();
        Item figurine = new Item();

        // Set the descriptions
        container.setDescription("chest");
        figurine.setDescription("figurine");
                
        // Put the figurine into the container
        container.setContents(figurine);
                
        // Open the container
        container.interact();
        
        // It's full, so should say "chest containing a figurine"
        assertEquals("chest containing a figurine", container.getDescription());
    }
    
    @Test
    public void testEmptyWeight() {
        // Create a new container
        Container container = new Container();

        // Set its weight
        container.setWeight(10);
        
        // An empty container should just return its weight
        assertEquals(10, container.getWeight());
    }
    
    @Test
    public void testFullWeight() {
        // Create a new container and figurine
        Container container = new Container();
        Item figurine = new Item();

        // Set the weights
        container.setWeight(10);
        figurine.setWeight(2);
        
        // Put the figurine into the container
        container.setContents(figurine);
                
        // A full container should weigh the sum of the weights
        assertEquals(12, container.getWeight());
    }
    
}

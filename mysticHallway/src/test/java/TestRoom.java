/**
 * Created by aliceeaster on 2/23/17.
 */
import static org.junit.Assert.*;

import me.codewonderland.mystichallway.Item;
import me.codewonderland.mystichallway.Room;
import org.junit.Test;

public class TestRoom {

    @Test
    public void testDescription() {
        // Initialize the room and items
        Room room = new Room();
        Item bed = new Item();

        // By default, the room should be called "A room"
        assertEquals(room.getDescription(), "A room");

        room.setDescription("A cool bedroom");

        // Make sure the setter and getter for descriptions work
        assertEquals(room.getDescription(), "A cool bedroom");

        bed.setDescription("bed");
        room.setItem(bed);

        // Make sure the description is generated correctly
        assertEquals(room.getDescription(), "A cool bedroom. This room contains a bed");
    }

    @Test
    public void testPickUp() {
        // Initialize the room and items
        Room room = new Room();
        Item key = new Item();
        Item decoy = new Item();
        room.setItem(key);

        // Assume the user has the decoy
        Item newItem = room.pickUpItemAndDrop(decoy);

        // Now, the newItem should be the key...
        assertTrue(newItem == key);

        // And the room has the decoy
        assertTrue(room.getItem() == decoy);
    }

}

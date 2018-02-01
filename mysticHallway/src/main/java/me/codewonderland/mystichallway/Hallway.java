package me.codewonderland.mystichallway;

/**
 * Created by aliceeaster on 2/23/17.
 */
public class Hallway {

    private Room[] rooms;
    private static String[] roomDescriptions = {"A cold room", "A blue room", "A boring room", "A big room",
            "A weird room", "A wet room", "A computer room", "A dungeon room", "A happy room", "A sad room",
            "A small room", "A dry room", "A hot room", "A red room", "A green room", "An exciting room"};
    private static String[] itemDescriptions = {"mace", "shackle", "sword", "banner", "table", "chair", "knife",
            "pineapple", "tomato", "Macbook Pro", "iMac", "iPhone", "Mac Mini", "iPad", "iPod", "mouse"};

    public void initialize() {
        Item roomItem;
        rooms = new Room[5];
        for(int i = 0; i < rooms.length; i++) {
            roomItem = new Item(calcRandomInsert(itemDescriptions), (Math.floor(Math.random() * 15)) + 1);
            rooms[i] = new Room(roomItem, calcRandomInsert(roomDescriptions));
        }
    }

    public Room getRoom(int i) {
        return rooms[i];
    }

    public int numberOfRooms() {
        return rooms.length;
    }

    private String calcRandomInsert(String options[]) {

        String choice;

        choice = options[(int) (Math.random() * options.length)];

        return choice;
    }
}
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
            roomItem = new Item(calcRandomInsert(itemDescriptions), (int)(Math.floor(Math.random() * 15)) + 1);
            rooms[i] = new Room(roomItem, calcRandomInsert(roomDescriptions));
        }

        Container emptyContainer, fullContainer;
        Ring ring = new Ring();
        Necklace necklace = new Necklace();
        Hat hat = new Hat();
        fullContainer = new Container("A cool container", 2);
        emptyContainer = new Container("A warm container", 1);
        fullContainer.setContents(hat);
        rooms[1].setItem(ring);
        rooms[2].setItem(fullContainer);
        rooms[3].setItem(necklace);
        rooms[4].setItem(emptyContainer);
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


public class Room {
    private Item item;
    private String description;

    public Room() {
        this.description  = "A room";
    }

    public Room(Item item, String description) {
        this.item = item;
        this.description = description;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getDescription() {
        if (item != null) {
            return description + ". This room contains a " + item.getDescription();
        } else {
            return description;
        }
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Item pickUpItemAndDrop(Item oldItem){
        Item tempItem = this.item;
        this.item = oldItem;
        return tempItem;
    }

}

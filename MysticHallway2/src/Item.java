public class Item {

    private String description;
    private int weight;

    public Item() {
        this.description = "An item";
        this.weight = 0;
    }

    public Item(String description, int weight) {
        this.description = description;
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    public void interact() {
        // By default, nothing happens
    }
    
}

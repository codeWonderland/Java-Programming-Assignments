package me.codewonderland.mystichallway;

/**
 * Created by aliceeaster on 2/23/17.
 */
public class Item {
    private String description;
    private double weight;

    public Item() {
        this.description = "An item";
    }

    public Item(String description, double weight) {
        this.description = description;
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

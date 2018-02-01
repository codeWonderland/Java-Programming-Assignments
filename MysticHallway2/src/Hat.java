/**
 * Created by aliceeaster on 3/15/17.
 */
public class Hat extends Item implements Wearable {

    public Hat() {
        super("a hat to wear on your head", 5);
    }

    public String wornOn() {
        return "head";
    }

    public int addDefense() {
        return 15;
    }

    public int addMaxHealth() {
        return 5;
    }
}

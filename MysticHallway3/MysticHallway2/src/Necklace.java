/**
 * Created by aliceeaster on 3/15/17.
 */
public class Necklace extends Item implements Wearable {

    public Necklace() {
        super("a necklace to wear on your neck", 2);
    }

    public String wornOn() {
        return "neck";
    }

    public int addDefense() {
        return 0;
    }

    public int addMaxHealth() {
        return 15;
    }
}

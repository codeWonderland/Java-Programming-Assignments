/**
 * Created by aliceeaster on 3/15/17.
 */
public class Ring extends Item implements Wearable {

    public Ring() {
        super("a ring to wear on your finger", 1);
    }

    public String wornOn() {
        return "finger";
    }

    public int addDefense() {
        return 5;
    }

    public int addMaxHealth() {
        return 10;
    }
}

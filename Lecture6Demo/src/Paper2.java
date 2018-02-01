
public class Paper2 extends Weapon2 {
    
    Paper2() {
        name = "paper";
    }

    boolean beats(Weapon2 otherWeapon) {
        if ("rock".equals(otherWeapon.name)) {
            return true;
        } else {
            return false;
        }
    }

}

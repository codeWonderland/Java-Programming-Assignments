
public class Rock2 extends Weapon2 {
    
    Rock2() {
        name = "rock";
    }
    
    boolean beats(Weapon2 otherWeapon) {
        if ("scissors".equals(otherWeapon.name)) {
            return true;
        } else {
            return false;
        }
    }

}

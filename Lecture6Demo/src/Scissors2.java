
public class Scissors2 extends Weapon2 {
    
    Scissors2() {
        name = "scissors";
    }
    
    boolean beats(Weapon2 otherWeapon) {
        if ("paper".equals(otherWeapon.name)) {
            return true;
        } else {
            return false;
        }
    }

}

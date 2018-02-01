import java.util.Scanner;

@SuppressWarnings("resource")
public class VermontTrail {
    
    public static void main(String args[]) {
        // Set up the explorer and other things we need
        Explorer explorer = new Explorer();
        explorer.setHealth(10);
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("You are on the Vermont trail.");
        System.out.println();

        while(explorer.getHealth() > 0) {
            System.out.println("You are " + (explorer.getDistance() * 10) + " miles from home");
            
            System.out.println("Do you want to (m)ove or (s)leep?");
            String command = userInput.nextLine();
            if (command.startsWith("m")) {
                explorer.move();
            } else {
                explorer.sleep();
                System.out.println("ZZZZZZZZ.....");
                System.out.println("You have " + explorer.getHealth() + " HP");
            }
            
            System.out.println();
        }
        
        System.out.println("GAME OVER");
    }

}

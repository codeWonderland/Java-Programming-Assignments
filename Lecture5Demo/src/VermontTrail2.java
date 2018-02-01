import java.util.Scanner;

@SuppressWarnings("resource")
public class VermontTrail2 {
    
    public static void main(String args[]) {
        // Set up the explorer and other things we need
        Explorer2 explorer = new Explorer2();
        explorer.setHealth(10);
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("You are on the Vermont trail.");
        System.out.println();

        while(explorer.getHealth() > 0) {
            boolean encounter = (Math.random() < .3);
            System.out.println("You are " + (explorer.getDistance() * 10) + " miles from home");
            
            if (encounter) {
                Beast2 beast = new Beast2();
                beast.setHealth((int)(Math.random() * 4) + 1);
                System.out.println("You encounter a beast");
                
                while(beast.getHealth() > 0) {
                    System.out.println("You have " + explorer.getHealth() + " HP");
                    System.out.println("The beast has " + beast.getHealth() + " HP");
                    System.out.println("Do you want to (a)ttack or (r)un?");
                    String command = userInput.nextLine();
                    if (command.startsWith("a")) {
                        System.out.println("You attack!");
                        explorer.attack(beast);
                    } else {
                        System.out.println("You run away");
                        explorer.move();
                        break;
                    }
                }
                
                System.out.println("The fight is over");
                System.out.println();
                
            } else {
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
        }

        System.out.println("GAME OVER");
    }

}

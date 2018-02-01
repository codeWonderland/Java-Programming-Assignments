        import java.util.Scanner;
        
        @SuppressWarnings("resource")
        public class MysticHallway {
        
            public static void main(String args[]) {
                
                boolean playing = true;
                int currentRoomNumber = 0;
                Item inventory = null;
                Hallway hallway = new Hallway();
                hallway.initialize();
                
                Scanner userInput = new Scanner(System.in);
                
                while(playing) {
                    Room currentRoom = hallway.getRoom(currentRoomNumber);
                    
                    System.out.println(currentRoom.getDescription());
                    
                    String directions;
                    
                    if (currentRoomNumber == 0) {
                        directions = "(r)ight";
                    } else if (currentRoomNumber < hallway.numberOfRooms() - 1) {
                        directions = "(l)eft or (r)ight";
                    } else {
                        directions = "(l)eft";
                    }
                    
                    System.out.println("From here you can go " + directions + ", (i)nteract, (p)ick up, or (q)uit");
                    System.out.println("What would you like to do?");
        
                    String command = userInput.nextLine().toLowerCase();
                    
                    if (command.startsWith("l")) {
                        if (currentRoomNumber == 0) {
                            System.out.println("You bonk your head on the wall, hard");
                        } else {
                            currentRoomNumber--;
                        }
                    } else if (command.startsWith("i")) {
                        Item roomItem = currentRoom.getItem();
                        
                        if (roomItem != null) {
                            roomItem.interact();
                            System.out.println("You interact with the " + roomItem.getDescription());
                        } else {
                            System.out.println("There is nothing here to interact with");
                        }
                    } else if (command.startsWith("r")) {
                        if (currentRoomNumber == hallway.numberOfRooms() - 1) {
                            System.out.println("Face. Wall. Smack.");
                        } else {
                            currentRoomNumber++;
                        }
                    } else if (command.startsWith("p")) {
                        inventory = currentRoom.pickUpItemAndDrop(inventory);
                        if (inventory != null) {
                            System.out.println("You pick up the " + inventory.getDescription());
                        } else {
                            System.out.println("There is nothing here to pick up.  You dropped your item.");
                        }
                    } else if (command.startsWith("q")) {
                        playing = false;
                    } else {
                        System.out.println("Sorry, I can't understand.");
                        System.out.println("The commands are: go (l)eft, go (r)ight, (i)nteract, (p)ick up, and (q)uit.");
                    }
                }
            }
        }

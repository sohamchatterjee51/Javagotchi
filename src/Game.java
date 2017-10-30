/**
 * Created by k1763617 on 30/10/17.
 */
import java.util.Scanner;


public class Game {
    public void run() {
        boolean userQuits = false;

        startTutorial();
        while (!userQuits) {
        interact();
        print(this.creature.checkstatus());
        }
    }

    private void startTutorial() {
    System.out.println("Hi there! Welcome to Tamagotchi!");
    System.out.println("What's the name of your creature?");

        String name = scanner.nextLine();

        this.creature= new Creature(name);

        System.out,println("Great, you can now meet" + this.creature.getName());
    }

    private void interact(){
      print("What would you like to do");
      print("1.Play");
      print("2. Eat");
      print("3. Sleep");
      print("4. Quit");

    int choice =scanner.nextInt();

    switch (choice){
        case 1:
         creature.play();
         break;
     case 2:
         creature.eat();
         break;
        case 3:
         creature.Sleep();
        break;
        case 4:
        userQuits=true;
      break;
        case 5:
        print("Whoops, you have to pick a number between 1 and 4 ");
       break;

    }
    }


    public void print(String s){
        System.out.println(s);
    }

}

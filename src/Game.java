/**
 * Created by k1764166 on 30/10/17.
 */
import java.util.Scanner;
public class Game {

    Scanner scanner = new Scanner(System.in);
    Creature creature;
    boolean userQuits = false;

    public void run()
    {
        startTutorial();
        while(!userQuits){
            interact();
            System.out.println(this.creature.checkStatus());
        }

        System.out.println("Time to put the creature to sleep");
    }

    private void startTutorial() {
        System.out.println("Hello. Welcome to Javagotchi. /n What is the name of your creature?");
        String name = scanner.nextLine();
        this.creature = new Creature(name);
        System.out.println("Great, you can now meet " + this.creature.getName() + "!");

    }

    private void interact()
    {
        System.out.println("What would you like to do?");
        System.out.println("1. Play");
        System.out.println("2. Eat");
        System.out.println("3. Sleep");
        System.out.println("4. Quit Game");

        int choice = scanner.nextInt();

        switch (choice)
        {
            case 1:
                creature.play();
                break;
            case 2:
                creature.eat();
                break;
            case 3:
                creature.sleep();
                break;
            case 4:
                userQuits = true;
                break;
            default:
                System.out.println("oops please pick a number between 1 & 4");
                break;

        }


    }
}

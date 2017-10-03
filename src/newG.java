import java.util.Scanner;
import java.util.ArrayList;

public class newG
{
        static String name;
        public static void newGame()
        {
            Scanner scanName = new Scanner(System.in);
            Scanner command = new Scanner(System.in);
            Scanner enterKey = new Scanner(System.in);
            //
            String enter; //used to press enter to next line
            String finalCommand; //command that is then processed
            String playerName; //players name
            //
            //Game Start
            System.out.println("What is your name?");
            playerName = scanName.next();
            newG name = new newG();
            newG.name = playerName;

            System.out.println("Welcome to the world of trash.");
            System.out.println("You're bad at life. You only know");
            System.out.println("how to punch and kick. Look it's");
            System.out.println("a Pokemon, go violently attack it."); enter = enterKey.nextLine();

            pikachu battle1 = new pikachu();
            battle1.pikachu();

            bulby battle2 = new bulby();
            battle2.bulby();

        }

        public static void main(String [ ] args)
        {
            newG.newGame();
        }
}

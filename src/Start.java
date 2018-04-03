import Pokemon.bulby;
import Pokemon.pikachu;
import Subsystems.player;

import java.util.Scanner;

public class Start
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
            player player = new player();
            //Game Start
            System.out.println("What is your name?");
            playerName = scanName.next();
            Start name = new Start();
            Start.name = playerName;

            System.out.println("Welcome to the world of trash.");
            System.out.println("You're bad at life. You only know");
            System.out.println("how to punch and kick. Look it's");
            System.out.println("a Pokemon, go violently attack it.");
            enter = enterKey.nextLine();

            pikachu battle1 = new pikachu();
            battle1.pikachu();

            System.out.println(" ");
            System.out.println("Good first battle! Oh wait");
            System.out.println("Their's another one, ATTACK!!!");
            System.out.println(" ");
            enter = enterKey.nextLine();

            bulby battle2 = new bulby();
            battle2.bulby();

            if (player.playerLevel == 1)
            {
                System.out.println(" ");
                System.out.println("You got the hang of this.");
                System.out.println("Keep battling until you get to level 2");
                System.out.println(" ");

                battle1.pikachu();
                battle2.bulby();

            }

            System.out.println("Great. Come back later when the game is finished.");

        }

        public static void main(String [ ] args)
        {
            Start.newGame();
        }
}

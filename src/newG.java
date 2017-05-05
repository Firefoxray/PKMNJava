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
            
            pikachu battle = new pikachu();
            battle.pikachu();
            
        }
}

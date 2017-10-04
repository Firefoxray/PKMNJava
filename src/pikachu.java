import java.util.Scanner;
import java.util.Random;
/**
 * Write a description of class pikachu here.
 * 
 * @author Ray Anthony //B.// Barrett Junior
 * @version (a version number or a date)
 */

public class pikachu
{
    static String name;
    static int health;
    static String displayHealth;
    static int exp;
    static int end;
    static int turns;
    static int level;
    static int healthXP;
    static int turnsXP;
    static int levelXP;
    static int during;

    @SuppressWarnings("Duplicates")
    public void pikachuEXP()
    {
        int healthXP = health + 1;
        int turnsXP = turns;
        int levelXP = level;

        pikachu.healthXP = healthXP;
        pikachu.turnsXP = turnsXP;
        pikachu.levelXP = levelXP;

        calculateEXP.level = pikachu.levelXP;
        calculateEXP.health = pikachu.healthXP;
        calculateEXP.turns = pikachu.turnsXP;

        calculateEXP calculate = new calculateEXP();
        calculate.exp();

        exp = calculateEXP.exp;
        pikachu.exp = exp;
        calcConvert.getpkmnEXP = pikachu.exp;
    }

    public void pikachu()
    {
        //Preliminary Commands
        Scanner command = new Scanner(System.in);
        String finalCommand;
            
        Scanner enterKey = new Scanner(System.in);
        String enter;
        //

        //Method Calls
        picture draw = new picture();
        calcConvert conv = new calcConvert();
        //

        //Random
        Random rand = new Random();
        int level = rand.nextInt(10) + 1;
        pikachu.level = level;
        //

        //
        name = newG.name;
        int health = level + 10;
        pikachu.health = health;
        int end = 0;
        int a = 1;
        //

        //Start
        calcConvert.getpkmnHealth = pikachu.health;
        calcConvert.getpkmnLevel = pikachu.level;
        draw.pikapic();
        conv.convert();

        System.out.println("A Wild Pikachu Appeared!!!!"); enter = enterKey.nextLine();

            for (health = health; health != 0;)
            {
                turns = turns + 1;
                a = 1;
                while(a == 1) {
                
                    if (a == 1)
                    {
                        draw.que();
                    }
                    finalCommand = command.next();
                    for (a = 1; a == 1; a++)
                    {
                        
                        if (finalCommand.equalsIgnoreCase("Run")){
                            pikachu.end = 1;
                            health = 0;
                            System.out.println(" ");
                            System.out.println(name + " Got Away Safely!!!");
                            //enter = enterKey.nextLine();
                        } else if (finalCommand.equalsIgnoreCase("Bag")) {
                            draw.pikapic();
                            conv.convert();
                            System.out.println(" ");
                            System.out.println("Command Not Availiable Now");
                            System.out.println(" ");
                        } else if (finalCommand.equalsIgnoreCase("Attack")) {
                            draw.attack();
                            finalCommand = command.next();
                                if (finalCommand.equalsIgnoreCase("Punch")){
                                    health = health - 5;
                                    if (health < 0)
                                    {
                                        health = 0;
                                    }
                                    pikachu.health = health;
                                    calcConvert.getpkmnHealth = pikachu.health;
                                    conv.healthUpdate();
                                    draw.pikapic();
                                    if (health !=0)
                                    {
                                        System.out.println("You have damaged for 5 health");
                                        //calcConvert.getDuring = 1;
                                        conv.convert();
                                        //calcConvert.getDuring = 0;
                                    }
                                } else {
                                    System.out.println("What?");
                                    System.out.println(" ");
                                }
                                if (finalCommand.equalsIgnoreCase("Kick")){
                                    health = health - 7;
                                    if (health < 0)
                                    {
                                        health = 0;
                                    }
                                    pikachu.health = health;
                                    calcConvert.getpkmnHealth = pikachu.health;
                                    conv.healthUpdate();
                                    draw.pikapic();
                                    if (health !=0)
                                    {
                                        System.out.println("You have damaged for 7 health");
                                        //calcConvert.getDuring = 1;
                                        conv.convert();
                                        //calcConvert.getDuring = 0;
                                    }
                                } else {
                                    System.out.println("What?");
                                    System.out.println(" ");
                                }
                        
                            } else {
                                draw.pikapic();
                                System.out.println("What?");
                            }
                        }
                    }
            }
            if (pikachu.end == 1)
            {
                end = 0;

            } else {
                System.out.println("Pikachu Has Fainted");
                enter = enterKey.nextLine();
                pikachuEXP();
                /*
                Debugger
                System.out.println("Debugger");
                System.out.println("Health" + healthXP);
                System.out.println("Turns" + turnsXP);
                System.out.println("Level" + levelXP);
                */

                System.out.println("You Have Received " + exp + " EXP");
            }

            enter = enterKey.nextLine();

            player calc = new player();
            calc.player();


            //System.out.println(" ");
            //System.out.println("Reached End");
    }
}

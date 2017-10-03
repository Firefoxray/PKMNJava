import java.util.Random;
import java.util.Scanner;

public class bulby
{

    static String name;
    static String displayHealth;
    static int health;
    static int exp;
    static int end;
    static int turns;
    static int level;
    static int healthXP;
    static int turnsXP;
    static int levelXP;

    @SuppressWarnings("Duplicates")
    public void bulbyEXP()
    {
        int healthXP = health + 1;
        int turnsXP = turns;
        int levelXP = level;

        bulby.healthXP = healthXP;
        bulby.turnsXP = turnsXP;
        bulby.levelXP = levelXP;

        calculateEXP.level = bulby.levelXP;
        calculateEXP.health = bulby.healthXP;
        calculateEXP.turns = bulby.turnsXP;

        calculateEXP calculate = new calculateEXP();
        calculate.exp();

        exp = calculateEXP.exp;
        bulby.exp = exp;
    }

    public void bulby()
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
        player calc = new player();
        pkmnHealth test = new pkmnHealth();
        //

        //Random
        Random rand = new Random();
        int level = rand.nextInt(15) + 5;
        bulby.level = level;
        //

        //
        name = newG.name;
        int health = level + 10;
        bulby.health = health;
        int end = 0;
        int a = 1;
        //

        //Start
        calcConvert.getpkmnHealth = bulby.health;
        calcConvert.getpkmnLevel = bulby.level;
        draw.bulby();
        conv.convert();

        System.out.println("A Wild Bulby Appeared!!!!"); enter = enterKey.nextLine();

        for (health = health; health != 0;)
        {
            turns = turns + 1;
            a = 1;
            while(a == 1)
            {
                if (a == 1)
                {
                    draw.que();
                }

                finalCommand = command.next();
                for(a = 1; a == 1; a++)
                {
                    if (finalCommand.equalsIgnoreCase("Run"))
                    {
                        bulby.end = 1;
                        health = 0;
                        System.out.println(" ");
                        System.out.println(name + "Got Away Safely!!!");

                    } else if (finalCommand.equalsIgnoreCase("Bag"))
                    {
                        draw.bulby(); conv.convert();
                        System.out.println(" ");
                        System.out.println("Command Not Availiable Now");
                        System.out.println(" ");

                    } else if (finalCommand.equalsIgnoreCase(("Attack")))
                    {
                        draw.bulby(); conv.convert();
                        draw.attack();
                        finalCommand = command.next();

                            if (finalCommand.equalsIgnoreCase("Punch"))
                            {
                                health =-5;

                                if (health < 0)
                                {
                                    health = 0;
                                }
                                bulby.health = health;
                                calcConvert.getpkmnHealth = bulby.health;
                                conv.healthUpdate(); draw.bulby();


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

                                bulby.health = health;
                                calcConvert.getpkmnHealth = bulby.health;
                                conv.healthUpdate(); draw.bulby();

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
                        draw.bulby();
                        System.out.println("What?");
                    }
                }
            }
        }
        if (end == 1)
        {
            end = 0;

        } else {
            System.out.println("Bulby Has Fainted"); enter = enterKey.nextLine();
            bulbyEXP();
            System.out.println("You Have Received " + exp + " EXP");
        }

        enter = enterKey.nextLine();
        calc.player();

        System.out.println(" ");
        System.out.println("Reached End");






    }





}

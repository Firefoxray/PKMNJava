import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class pikachu here.
 * 
 * @author Ray Anthony //B.// Barrett Junior
 * @version (a version number or a date)
 */

public class pikachu
{
    static String name;
    static int health = 20;
    static String displayHealth;
    static int exp;
    public void pikachu()
    {
            Scanner command = new Scanner(System.in);
            String finalCommand;
            
            Scanner enterKey = new Scanner(System.in);
            String enter;
            //
            name = newG.name;
            health = pikachu.health;
            health = 20;
            //
            int a = 1;
            //
            pikachuPicture draw = new pikachuPicture();
            draw.pikapic();
            pkmnHealth print = new pkmnHealth();
            print.health();
            print.drawHealth();
            //System.out.println("HP: ░░░░░░░░░░░░░░░░░░░░ 20HP ");
            //System.out.println(" ");
            System.out.println("A Wild Pikachu Appeared!!!!");
            enter = enterKey.nextLine();
            //System.out.println(" ");
            //System.out.println("What will you do?");
            //System.out.println(" ");
            //System.out.println("░░░░░░░");
            //System.out.println("░ Attack ░");
            //System.out.println("░ Bag    ░");
            //System.out.println("░ Run    ░");
            //System.out.println("░░░░░░░");
            
            
            //finalCommand = command.next();
            for (health = health; health != 0;) {  
                a = 1;
                while(a == 1) {
                
                    if (a == 1) {
                        //System.out.println("HP: ░░░░░░░░░░░░░░░░░░░░ 20HP ");
                        //draw.pikapic();
                        System.out.println("What will you do?");
                        System.out.println(" ");
                        System.out.println("░░░░░░░");
                        System.out.println("░ Attack ░");
                        System.out.println("░ Bag    ░");
                        System.out.println("░ Run    ░");
                        System.out.println("░░░░░░░");
                    }
                    finalCommand = command.next();
                    for (a = 1; a == 1; a++)
                    {
                        
                        if (finalCommand.equalsIgnoreCase("Run")){
                            health = 0;
                            System.out.println(" ");
                            System.out.println(name + " Got Away Safely!!!");
                            //enter = enterKey.nextLine();
                        } else if (finalCommand.equalsIgnoreCase("Bag")) {
                            draw.pikapic();
                            System.out.println(" ");
                            System.out.println("Command Not Availiable Now");
                            System.out.println(" ");
                        } else if (finalCommand.equalsIgnoreCase("Attack")) {
                            System.out.println(" ");
                            System.out.println("░░░░░░░");
                            System.out.println("░ Punch  ░");
                            System.out.println("░ Kick   ░");
                            System.out.println("░░░░░░░");
                            System.out.println(" ");
                            finalCommand = command.next();
                                if (finalCommand.equalsIgnoreCase("Punch")){
                                    health = health - 5;
                                    if (health < 0)
                                    {
                                        health = 0;
                                    }
                                    pikachu.health = health;
                                    pkmnHealth.getHealth = pikachu.health;
                                    print.health();
                                    draw.pikapic();
                                    if (health !=0)
                                    {
                                        System.out.println("You have damaged for 5 health");
                                        print.drawHealth();
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
                                    pkmnHealth.getHealth = pikachu.health;
                                    print.health();
                                    draw.pikapic();
                                    if (health !=0)
                                    {
                                        System.out.println("You have damaged for 7 health");
                                        print.drawHealth();
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
            System.out.println("Pikachu Has Fainted");
            enter = enterKey.nextLine();
            calculateEXP calculate = new calculateEXP();
            calculate.exp();
            exp = calculateEXP.exp;
            System.out.println("You Have Recived " + exp + " EXP");
            enter = enterKey.nextLine();
            System.out.println(" ");
            System.out.println("Reached End");
    }
}

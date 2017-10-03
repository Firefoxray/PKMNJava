
/**
 * Write a description of class calculateEXP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class calculateEXP
{
    static int exp;
    static int level = pikachu.levelXP;
    static int health = pikachu.healthXP;
    static int turns = pikachu.turnsXP;

    public void exp()
    {
        calc();
        exp = (turns + level) / health;
        calculateEXP.exp = exp;
    }

    public void calc()
    {
        //pikachu calcEXP = new pikachu();
        //calcEXP.pikachuEXP();

        level = pikachu.levelXP;
        health = pikachu.healthXP;
        turns = pikachu.turnsXP;

    }
}

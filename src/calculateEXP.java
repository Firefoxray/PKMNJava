
/**
 * Write a description of class calculateEXP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class calculateEXP
{
    static int exp;
    static int level = pikachu.level;
    static int health = pikachu.health;
    static int turns = pikachu.turns;

    public void exp()
    {
        calc();
        calculateEXP.exp = (level * health) / turns;
    }

    public void calc()
    {
        pikachu calcEXP = new pikachu();
        calcEXP.pikachuEXP();

        calculateEXP.level = pikachu.level;
        calculateEXP.health = pikachu.health;
        calculateEXP.turns = pikachu.turns;

    }
}

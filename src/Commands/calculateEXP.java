package Commands;

/**
 * Write a description of class Commands.calculateEXP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class calculateEXP
{
    static int exp;
    static int level;
    static int health;
    static int turns;

    public void exp()
    {
        //calc();
        exp = (turns + level) / health;
        calculateEXP.exp = exp;
    }

    /**
    public void calc()
    {
        //Pokemon.pikachu calcEXP = new Pokemon.pikachu();
        //calcEXP.pikachuEXP();

        level = Pokemon.pikachu.levelXP;
        Subsystems.health = Pokemon.pikachu.healthXP;
        turns = Pokemon.pikachu.turnsXP;

    }
    **/
}

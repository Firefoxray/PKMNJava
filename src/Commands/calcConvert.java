package Commands;

import Pokemon.pikachu;
import Subsystems.health;

public class calcConvert
{
    static int getpkmnHealth;
    static int getpkmnLevel;
    static int getpkmnEXP;
    static int getDuring;


    public void convert()
    {
        //Method Call
        health call = new health();

        call.getHealth = getpkmnHealth;
        call.getLevel = getpkmnLevel;
        call.health();

        if (pikachu.during == 0)
        {
            call.drawHealth();
        }

    }
    public void healthUpdate()
    {
        pkmnHealth call = new pkmnHealth();
        call.health();
    }


}

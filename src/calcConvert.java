public class calcConvert
{
    static int getpkmnHealth;
    static int getpkmnLevel;
    static int getpkmnEXP;
    static int getDuring;

    public void convert()
    {
        //Method Call
        pkmnHealth call = new pkmnHealth();

        pkmnHealth.getHealth = getpkmnHealth;
        pkmnHealth.getLevel = getpkmnLevel;
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

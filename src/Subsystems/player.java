package Subsystems;

/**
 * Write a description of class Subsystems.player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player
{
    String name = Start.name;
    private static int playerHealth;
    private static int playerExp;
    private static int playerLevel = 1;
    //
    static int exp;
    
    public void player()
    {
        //After Battle
        expGain();
        int finalXP = player.playerExp;

        System.out.println(name + " EXP = " + playerExp);

        if (playerExp == 20)
        {
            playerLevel = playerLevel + 1;
            playerExp = 0;
            System.out.println("Your level has increased!");
            System.out.println("You are now level: " + playerLevel);
        }



    }



    public void expGain()
    {
        exp = calcConvert.getpkmnEXP;
        player.playerExp = player.playerExp + exp;

    }


}

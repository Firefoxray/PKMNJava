
/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player
{
    String name = newG.name;
    static int playerHealth;
    static int playerExp;
    static int playerLevel = 1;
    //
    static int exp;
    
    public void player()
    {
        //After Battle
        expGain();
        System.out.println(name + " EXP = " + playerExp);
        if (playerExp == 20);
        {
            playerLevel = playerLevel + 1;
            playerExp = 0;
        }
    }



    public void expGain()
    {
        exp = calcConvert.getpkmnEXP;
        playerExp = playerExp + exp;
    }


}

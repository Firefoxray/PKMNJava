
public class pkmnHealth
{
    int health;
    static int getHealth;
    static int getLevel;

    public int health()
    {
        //drawHealth();
        return health;
    }

    public void drawHealth()
    {
        System.out.println("Level: " + getLevel);

        System.out.print("HP: ");
        for (int i = getHealth; i != 0;  i--)
        {
            System.out.print("░");
        }
        System.out.print(" " + getHealth + " HP");
        System.out.println(" ");
        System.out.println(" ");
    }

    //public int lowerHealth()
    //{
        //health = pikachu.health
        //for (i = 0; 
    //}
}

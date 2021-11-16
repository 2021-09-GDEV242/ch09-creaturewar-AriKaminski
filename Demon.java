/**
 * Write a description of class Demon here.
 * 
 * @author Ari Kaminski 
 * @version Nov 13 2021
 */
public class Demon extends Creature
{
    private static final int MAX_DEMON_HP = 100;
    private static final int MIN_DEMON_HP = 50;
    private static final int MAX_DEMON_STR = 75;
    private static final int MIN_DEMON_STR = 25;

    /**
     * Constructor for objects of class Demon
     */
    public Demon()
    {
        super(Randomizer.nextInt(MAX_DEMON_STR-MIN_DEMON_STR)+MIN_DEMON_STR,
              Randomizer.nextInt(MAX_DEMON_HP-MIN_DEMON_HP)+MIN_DEMON_HP);
          
    }
    
    public Demon(int str, int hp) 
    {
        super(str, hp);
    }
    
    public int damage() 
    {
        int demon_damage;
        demon_damage = super.attack();          
           if (Randomizer.nextInt(20)==0) {
               demon_damage +=50;
            }          
        return demon_damage;
    }
}
/**
 * Write a description of class Orc here.
 *
 * @author Ari Kaminski
 * @version Nov 13 2021
 */
public class Orc extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_ORC_HP = 25;
    private static final int MIN_ORC_HP = 8;
    private static final int MAX_ORC_STR = 20;
    private static final int MIN_ORC_STR = 5;

    /**
     * Constructor for objects of class Orc
     */
    public Orc()
    {
        super(
            Randomizer.nextInt(MAX_ORC_STR - MIN_ORC_STR) + MIN_ORC_STR,
            Randomizer.nextInt(MAX_ORC_HP - MIN_ORC_HP) + MIN_ORC_HP);           
    }

    /**
     * An example of a method - replace this comment with your own
     *
     *
     * @return Returns an int, orc_damage. Has a chance to do 0 damage on turn
     */
    public int damge()
    {
        // put your code here
        int orc_damage;
        orc_damage = super.attack();
        //add a chance for dumb orc to miss an attack
        if(Randomizer.nextInt(10) == 0){
            orc_damage = 0;
        }
        return orc_damage;
    }
}

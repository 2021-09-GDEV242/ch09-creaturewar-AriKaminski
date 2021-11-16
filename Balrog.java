/**
 * Write a description of class Balrog here.
 * 
 * @author Ari Kaminski
 * @version Nov 13 2021
 */
public class Balrog extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_BALROG_HP = 200;
    private static final int MIN_BALROG_HP = 100;
    private static final int MAX_BALROG_STR = 150;
    private static final int MIN_BALROG_STR = 80;
    public Balrog()
    {
        super(
            Randomizer.nextInt(MAX_BALROG_STR-MIN_BALROG_STR)+MIN_BALROG_STR,
            Randomizer.nextInt(MAX_BALROG_HP-MIN_BALROG_HP)+MIN_BALROG_HP);
          
    }
    
    /**
     * @return Returns an int, balrog damage. Adds two attacks together to attack "twice" each round
     */
    public int damage() {

            return super.damage() + super.damage();
    }
}

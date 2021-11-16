/**
 * Write a description of class Elf here.
 * 
 * @author Ari Kaminski 
 * @version Nov 13 2021
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;

    /**
     * Constructor for objects of class elf
     */
    public Elf()
    {
        super(
            Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR)+MIN_ELF_STR,
            Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP)+MIN_ELF_HP
        );
          
    }
    
    public int damage() 
    {
           int elf_damage;
           elf_damage = super.attack();
           
           if (Randomizer.nextInt(10)==0) {
               elf_damage = elf_damage * 2;
            }
           
            return elf_damage;
    }
}

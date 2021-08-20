public class Sorcerer
{
    //instance variables
    private String name;
    private int health;
    private int dmgToGoblin;
    private int dmgToDragon;
    private int dmgToGolem;

    //Constructor
    public Sorcerer(int health, int dmgToGoblin,int dmgToDragon, int dmgToGolem)
    {
        this.health = health;
        this.dmgToGoblin = dmgToGoblin;
        this.dmgToDragon = dmgToDragon;
        this.dmgToGolem = dmgToGolem;
    }//end full args constructor

    //getters and setters

    public int getHealth() {
        return health;
    }

    public int getDmgToGoblin() {
        return dmgToGoblin;
    }

    public int getDmgToDragon() {
        return dmgToDragon;
    }

    public int getDmgToGolem() {
        return dmgToGolem;
    }

    public void setHealth(int health) {
        health = health;
    }

    public void setDmgToGoblin(int dmgToGoblin) {
        this.dmgToGoblin = dmgToGoblin;
    }

    public void setDmgToDragon(int dmgToDragon) {
        this.dmgToDragon = dmgToDragon;
    }

    public void setDmgToGolem(int dmgToGolem) {
        this.dmgToGolem = dmgToGolem;
    }

    //brain methods
    public void exchangeAttacks(Enemies enemy)
    {
        health -= enemy.getAttackDmg();
        //note to self, the enemy cannot die as for right now
        System.out.println("The enemy has hit you for ");
    }//end brain method to inflict damage onto the enemies and vice versa

    public void healingPotion()
    {
        if(health < 1)
        {
            System.out.println("you are technically dead, but use this heal potion to lessen your death");
        }
        health+=25;
        if(health >200)
        {
            health = 200;
        }
    }//end brain method to heal the sorcerer


    //toString()

}

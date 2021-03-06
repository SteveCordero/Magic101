public class Sorcerer
{
    //instance variables
    private String name;
    private int health;
    private int dmgToGoblin;
    private int dmgToDragon;
    private int dmgToGolem;

    //Constructor
    public Sorcerer(String name, int health, int dmgToGoblin,int dmgToDragon, int dmgToGolem)
    {
        this.name = name;
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
        System.out.println("\n"+ enemy.getName() + " The " + enemy.getEnemyType() + " has hit you for "
                            + enemy.getAttackDmg() + " damage");
        switch(enemy.getEnemyType())
        {
            case GOBLIN:
                System.out.println("You hit " + enemy.getName() + " the Goblin for " + dmgToGoblin
                + " damage");
                break;
            case DRAGON:
                System.out.println("You hit " + enemy.getName() + " the Dragon for " + dmgToDragon
                        + " damage");
                break;
            case GOLEM:
                System.out.println("You hit " + enemy.getName() + " the Golem for " + dmgToGolem
                        + " damage");
                break;
        }
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
        System.out.println("25 health has been healed to " +  name);
    }//end brain method to heal the sorcerer


    //toString()
    public String toString()
    {
        String output ="\n" + name + " the Sorcerer:"
                + "\nDamage against Dragons: " + dmgToDragon
                + "\nDamage against Golems: " + dmgToGolem
                + "\nDamage against Goblines: " + dmgToGoblin;
        return output;
    }//end toString for the Sorcerer class
}

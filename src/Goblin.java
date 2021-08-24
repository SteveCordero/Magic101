public class Goblin extends Enemies
{
    //Instance Variables
    private int numClaws;
    private static int numGoblins;
    //Constructor
    public Goblin(String name, boolean hasClaws,int attackDmg,EnemyType enemyType,int numClaws)
    {
        super(name,hasClaws,attackDmg,enemyType);
        this.numClaws = numClaws;
        numGoblins++;
    }

    //Getters and Setters
    public int getNumClaws() {
        return numClaws;
    }

    public void setNumClaws(int numClaws) {
        this.numClaws = numClaws;
    }

    //Brain Methods
    public void validate()
    {
        if(numClaws < 0 )
        {
            System.out.println(super.getName()+ " the Goblin can't have negative claws");
        }
        else
        {
            System.out.println(super.getName() + " is a real Goblin");
        }
    }

    public void displayNumGoblins()
    {
        System.out.println("There are " + numGoblins + " Goblins");
    }
    //ToString
    public String toString()
    {
        String output = super.toString();
                output += "\nThis Goblin has " + numClaws + " claws\n";
        return output;
    }
}//end Goblin Class

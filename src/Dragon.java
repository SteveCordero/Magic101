public class Dragon extends Enemies
{
    //instance variables
    private int numWings;
    private int wingLength;
    private static int numDragons;

    //constructor
    public Dragon(String name, boolean hasClaws,int attackDmg,EnemyType enemyType, int numWings, int wingLength)
    {
        super(name,hasClaws, attackDmg,enemyType);
        this.numWings = numWings;
        this.wingLength = wingLength;
        numDragons++;

    }//end full args constructor

    //getters and setters

    public int getNumWings()
    {
        return numWings;
    }

    public int getWingLength()
    {
        return wingLength;
    }

    public void setNumWings(int numWings)
    {
        this.numWings = numWings;
    }

    public void setWingLength(int wingLength)
    {
        this.wingLength = wingLength;
    }

    //brain methods
    public boolean validate()
    {
        boolean hasClaws = super.getHasClaws();
        boolean isDragon = true;

        if(numWings < 2)
        {
            isDragon = false;
        }
        else if(wingLength < 1)
        {
            isDragon = false;
        }
        else if(hasClaws == false)
        {
            isDragon = false;
        }

        return isDragon;
    }//end brain method to check if dragon object is a valid dragon/ the validation

    public void displayNumDragons()
    {
        System.out.println("There are " + numDragons + " Dragons");
    }
    //toString
    public String toString()
    {
        String output = super.toString();
        output += "\nThis Dragon has " + numWings + " wings"
                + "\nthat are " + wingLength + " feet long"
                + "\nand does it have claws? \n";

        return output;
    }
}//end dragon class

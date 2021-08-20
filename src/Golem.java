enum Elements
{
    FIRE,
    WATER,
    AIR,
    EARTH,
    FAKE,
}

public class Golem extends Enemies
{
    //instance variables
    private Elements golemElement;

    //Constructors
    public Golem(String name, boolean hasClaws,int attackDmg,EnemyType enemyType, Elements golemElement)
    {
        super(name,hasClaws, attackDmg,enemyType);
        this.golemElement = golemElement;
    }//end of full args constructor

    //Getters and Setters
    public Elements getGolemElement()
    {
        return golemElement;
    }

    public void setGolemElement(Elements golemElement)
    {
        this.golemElement = golemElement;
    }

    //brain method
    public void validate()
    {
        switch(golemElement)
        {
            case FIRE:
                System.out.println("This Golem is of the Fire Element");
                break;
            case WATER:
                System.out.println("This Golem is of the Water Element");
                break;
            case EARTH:
                System.out.println("This Golem is of the Earth Element");
                break;
            case AIR:
                System.out.println("This Golem is of the AIR ELEMENT");
                break;
            default:
                System.out.println("That is not a valid golem element");
                break;
        }
    }//end method to check if the golem is a valid golem

    public String toString()
    {
        String output = super.toString();
        output += "\nThis is a " + golemElement + " golem.\n";
        return output;
    }//end method toString
}

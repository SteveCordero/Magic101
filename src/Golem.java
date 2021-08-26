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
    private static int numGolems;

    //Constructors
    public Golem(String name, boolean hasClaws,int attackDmg,EnemyType enemyType, Elements golemElement)
    {
        super(name,hasClaws, attackDmg,enemyType);
        this.golemElement = golemElement;
        numGolems++;
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
                System.out.println(super.getName() + " Golem is a valid Golem of the Fire Element");
                break;
            case WATER:
                System.out.println(super.getName() + " Golem is a valid Golem of the Water Element");
                break;
            case EARTH:
                System.out.println(super.getName() + " Golem is a valid Golem of the Earth Element");
                break;
            case AIR:
                System.out.println(super.getName() + " Golem is a valid Golem of the Air ELEMENT");
                break;
            default:
                System.out.println(super.getName() + " is not a valid golem element");
                break;
        }
    }//end method to check if the golem is a valid golem

    public void displayNumGolems()
    {
        System.out.println("There are " + numGolems + " Golems");
    }
    public String toString()
    {
        String output = super.toString();
        output += "\nThis is a " + golemElement + " golem.\n";
        return output;
    }//end method toString
}

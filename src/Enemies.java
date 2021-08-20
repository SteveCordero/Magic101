enum EnemyType
{
    GOBLIN,
    GOLEM,
    DRAGON,
}

public abstract class Enemies
{
    //Instance Variables
    private String name;
    private boolean hasClaws;
    private int attackDmg;
    private  EnemyType enemyType;

    //Constructor
    public Enemies(String name, boolean hasClaws,int attackDmg,EnemyType enemyType)
    {
        this.name = name;
        this.hasClaws = hasClaws;
        this.attackDmg = attackDmg;
        this.enemyType = enemyType;
    }

    //getters and setters
    public boolean getHasClaws()
    {
        return hasClaws;
    }

    public int getAttackDmg() {
        return attackDmg;
    }

    public String getName() {
        return name;
    }

    public void setHasClaws(boolean hasClaws) {
        this.hasClaws = hasClaws;
    }

    public void setAttackDmg(int attackDmg) {
        this.attackDmg = attackDmg;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "this bad boy has claws? " + hasClaws;
    }
}//end Enemies class

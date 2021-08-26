import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class MagicDriver
{
   public static void main(String[]args)
   {
       //Create all enemy and sorcerer objects
       Goblin kyle = new Goblin("Kyle",true,2,EnemyType.GOBLIN,5);
       Goblin gerome = new Goblin("Gerome",false,3,EnemyType.GOBLIN,-1);

       Dragon drago = new Dragon("Drago",true,10,EnemyType.DRAGON,7,7);
       Dragon geraldo = new Dragon("Geraldo",false,8,EnemyType.DRAGON, 3,10);

       Golem goldy = new Golem("Goldy",false,7,EnemyType.GOLEM, Elements.FIRE);
       Golem faker = new Golem("Faker",false,4,EnemyType.GOLEM, Elements.FAKE);

       Sorcerer waldo = new Sorcerer("Waldo",100,5,10,3);
       Sorcerer enigma = new Sorcerer("Enigma",100,6,4,7);


       //validate each of the enemy objects
        kyle.validate();
        gerome.validate();

       System.out.println("Is " + drago.getName()+ " a real dragon? " + drago.validate());
       System.out.println("Is " + geraldo.getName()+ " a real dragon? " + geraldo.validate());

        goldy.validate();
        faker.validate();

       System.out.println();

       //fix the objects that need to be validated
        gerome.setNumClaws(2);

        geraldo.setHasClaws(true);

        faker.setGolemElement(Elements.AIR);

       System.out.println();
       //validate the objects again
        gerome.validate();

       System.out.println("Is " + geraldo.getName()+ " a real dragon? " + geraldo.validate());

       faker.validate();

       System.out.println();
       //print out the enemies you are facing and their toStrings
       Enemies[] myEnemies = {kyle,gerome,drago,geraldo,goldy,faker};

       for(int i = 0; i < myEnemies.length; i++)
       {
           System.out.println(myEnemies[i]);
       }
       //Display how many of each enemey and sorcerers there are
       kyle.displayNumGoblins();
       drago.displayNumDragons();
       goldy.displayNumGolems();

       //make the enemies battle the sorcerers
       waldo.exchangeAttacks(gerome);
       System.out.println("waldo has " + waldo.getHealth() + " health");
       waldo.healingPotion();

       waldo.exchangeAttacks(geraldo);
       System.out.println("waldo has " + waldo.getHealth() + " health");

       waldo.exchangeAttacks(goldy);
       System.out.println("waldo has " + waldo.getHealth() +  " health");
       waldo.healingPotion();

       enigma.exchangeAttacks(kyle);
       System.out.println("enimga has " + enigma.getHealth() + " health");
       enigma.healingPotion();

       enigma.exchangeAttacks(drago);
       System.out.println("enigmas has " + enigma.getHealth() + " health");

       enigma.exchangeAttacks(faker);
       System.out.println("enigmas has " + enigma.getHealth() + " health");
       enigma.healingPotion();
   }
}//end driver
